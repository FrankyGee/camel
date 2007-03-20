/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.pojo;

import java.util.concurrent.atomic.AtomicInteger;

import junit.framework.TestCase;

import org.apache.camel.CamelContainer;
import org.apache.camel.InterceptorProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultExchange;

/**
 * @version $Revision: 520220 $
 */
public class PojoRouteTest extends TestCase {
	
	static class StringExchange extends DefaultExchange<String, String, String> {		
	}
	
    public void testJmsRoute() throws Exception {

        CamelContainer container = new CamelContainer();
        PojoComponent component = new PojoComponent();
        component.registerPojo("hello", new SayService("Hello!"));
        component.registerPojo("bye", new SayService("Good Bye!"));
        container.addComponent("default", component);
        
        final AtomicInteger hitCount = new AtomicInteger();
        final InterceptorProcessor<PojoExchange> tracingInterceptor = new InterceptorProcessor<PojoExchange>() {
        	@Override
        	public void onExchange(PojoExchange exchange) {
        		super.onExchange(exchange);
        		hitCount.incrementAndGet();
        	}
        };
        // lets add some routes
        container.routes(new RouteBuilder() {
            public void configure() {
                from("pojo:default:hello").intercept(tracingInterceptor).target().to("pojo:default:bye");
                
//                from("pojo:default:bye").intercept(tracingInterceptor).target().to("pojo:default:hello");
            }
        });

        
        container.activateEndpoints();
        
        // now lets fire in a message
        PojoEndpoint endpoint = (PojoEndpoint) container.endpoint("pojo:default:hello");
        ISay proxy = (ISay) endpoint.createInboundProxy(new Class[]{ISay.class});
        String rc = proxy.say();
        assertEquals("Good Bye!", rc);

        try {
			endpoint = (PojoEndpoint) container.endpoint("pojo:default:bye");
			proxy = (ISay) endpoint.createInboundProxy(new Class[]{ISay.class});
			rc = proxy.say();
			assertEquals("Hello!", rc);
			
		} catch (IllegalArgumentException expected) {
			// since bye is not active.
		}

        container.deactivateEndpoints();
    }
}
