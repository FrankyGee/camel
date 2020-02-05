/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.openstack.cinder;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CinderEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "apiVersion": ((CinderEndpoint) target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "config": ((CinderEndpoint) target).setConfig(property(camelContext, org.openstack4j.core.transport.Config.class, value)); return true;
        case "domain": ((CinderEndpoint) target).setDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((CinderEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((CinderEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((CinderEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "project": ((CinderEndpoint) target).setProject(property(camelContext, java.lang.String.class, value)); return true;
        case "subsystem": ((CinderEndpoint) target).setSubsystem(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((CinderEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((CinderEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CinderEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((CinderEndpoint) target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "config": ((CinderEndpoint) target).setConfig(property(camelContext, org.openstack4j.core.transport.Config.class, value)); return true;
        case "domain": ((CinderEndpoint) target).setDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((CinderEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((CinderEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((CinderEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "project": ((CinderEndpoint) target).setProject(property(camelContext, java.lang.String.class, value)); return true;
        case "subsystem": ((CinderEndpoint) target).setSubsystem(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((CinderEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((CinderEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CinderEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
