/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The Twilio component allows you to interact with the Twilio REST APIs using
 * Twilio Java SDK.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TwilioEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Twilio component.
     */
    public interface TwilioEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedTwilioEndpointConsumerBuilder advanced() {
            return (AdvancedTwilioEndpointConsumerBuilder) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default TwilioEndpointConsumerBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default TwilioEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default TwilioEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Twilio component.
     */
    public interface AdvancedTwilioEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default TwilioEndpointConsumerBuilder basic() {
            return (TwilioEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedTwilioEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedTwilioEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedTwilioEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedTwilioEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Twilio component.
     */
    public interface TwilioEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedTwilioEndpointProducerBuilder advanced() {
            return (AdvancedTwilioEndpointProducerBuilder) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default TwilioEndpointProducerBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default TwilioEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default TwilioEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Twilio component.
     */
    public interface AdvancedTwilioEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default TwilioEndpointProducerBuilder basic() {
            return (TwilioEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Twilio component.
     */
    public interface TwilioEndpointBuilder
            extends
                TwilioEndpointConsumerBuilder, TwilioEndpointProducerBuilder {
        default AdvancedTwilioEndpointBuilder advanced() {
            return (AdvancedTwilioEndpointBuilder) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default TwilioEndpointBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Twilio component.
     */
    public interface AdvancedTwilioEndpointBuilder
            extends
                AdvancedTwilioEndpointConsumerBuilder, AdvancedTwilioEndpointProducerBuilder {
        default TwilioEndpointBuilder basic() {
            return (TwilioEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwilioEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Twilio (camel-twilio)
     * The Twilio component allows you to interact with the Twilio REST APIs
     * using Twilio Java SDK.
     * 
     * Category: api,messaging,cloud
     * Available as of version: 2.20
     * Maven coordinates: org.apache.camel:camel-twilio
     * 
     * Syntax: <code>twilio:apiName/methodName</code>
     * 
     * Path parameter: apiName (required)
     * What kind of operation to perform
     * The value can be one of:
     * ACCOUNT,ADDRESS,APPLICATION,AVAILABLE_PHONE_NUMBER_COUNTRY,CALL,CONFERENCE,CONNECT_APP,INCOMING_PHONE_NUMBER,KEY,MESSAGE,NEW_KEY,NEW_SIGNING_KEY,NOTIFICATION,OUTGOING_CALLER_ID,QUEUE,RECORDING,SHORT_CODE,SIGNING_KEY,TOKEN,TRANSCRIPTION,VALIDATION_REQUEST,ADDRESS_DEPENDENT_PHONE_NUMBER,AVAILABLE_PHONE_NUMBER_COUNTRY_LOCAL,AVAILABLE_PHONE_NUMBER_COUNTRY_MOBILE,AVAILABLE_PHONE_NUMBER_COUNTRY_TOLL_FREE,CALL_FEEDBACK,CALL_FEEDBACK_SUMMARY,CALL_NOTIFICATION,CALL_RECORDING,CONFERENCE_PARTICIPANT,INCOMING_PHONE_NUMBER_LOCAL,INCOMING_PHONE_NUMBER_MOBILE,INCOMING_PHONE_NUMBER_TOLL_FREE,MESSAGE_FEEDBACK,MESSAGE_MEDIA,QUEUE_MEMBER,RECORDING_ADD_ON_RESULT,RECORDING_TRANSCRIPTION,RECORDING_ADD_ON_RESULT_PAYLOAD,SIP_CREDENTIAL_LIST,SIP_DOMAIN,SIP_IP_ACCESS_CONTROL_LIST,SIP_CREDENTIAL_LIST_CREDENTIAL,SIP_DOMAIN_CREDENTIAL_LIST_MAPPING,SIP_DOMAIN_IP_ACCESS_CONTROL_LIST_MAPPING,SIP_IP_ACCESS_CONTROL_LIST_IP_ADDRESS,USAGE_RECORD,USAGE_TRIGGER,USAGE_RECORD_ALL_TIME,USAGE_RECORD_DAILY,USAGE_RECORD_LAST_MONTH,USAGE_RECORD_MONTHLY,USAGE_RECORD_THIS_MONTH,USAGE_RECORD_TODAY,USAGE_RECORD_YEARLY,USAGE_RECORD_YESTERDAY
     * 
     * Path parameter: methodName (required)
     * What sub operation to use for the selected operation
     * The value can be one of: create,delete,fetch,read,update
     */
    default TwilioEndpointBuilder twilio(String path) {
        class TwilioEndpointBuilderImpl extends AbstractEndpointBuilder implements TwilioEndpointBuilder, AdvancedTwilioEndpointBuilder {
            public TwilioEndpointBuilderImpl(String path) {
                super("twilio", path);
            }
        }
        return new TwilioEndpointBuilderImpl(path);
    }
}