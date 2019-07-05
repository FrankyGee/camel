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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validates the payload of a message using the MSV Library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MsvEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MSV component.
     */
    public interface MsvEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMsvEndpointBuilder advanced() {
            return (AdvancedMsvEndpointBuilder) this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MsvEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MsvEndpointBuilder failOnNullBody(String failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MsvEndpointBuilder failOnNullHeader(boolean failOnNullHeader) {
            setProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MsvEndpointBuilder failOnNullHeader(String failOnNullHeader) {
            setProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * To validate against a header instead of the message body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MsvEndpointBuilder headerName(String headerName) {
            setProperty("headerName", headerName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MSV component.
     */
    public interface AdvancedMsvEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MsvEndpointBuilder basic() {
            return (MsvEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder basicPropertyBinding(
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
        default AdvancedMsvEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option is a:
         * <code>org.apache.camel.support.processor.validation.ValidatorErrorHandler</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder errorHandler(Object errorHandler) {
            setProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.processor.validation.ValidatorErrorHandler</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder errorHandler(String errorHandler) {
            setProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. See also
         * setResourceResolverFactory(ValidatorResourceResolverFactory).
         * 
         * The option is a: <code>org.w3c.dom.ls.LSResourceResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder resourceResolver(
                Object resourceResolver) {
            setProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. See also
         * setResourceResolverFactory(ValidatorResourceResolverFactory).
         * 
         * The option will be converted to a
         * <code>org.w3c.dom.ls.LSResourceResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder resourceResolver(
                String resourceResolver) {
            setProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * For creating a resource resolver which depends on the endpoint
         * resource URI. Must not be used in combination with method
         * setResourceResolver(LSResourceResolver). If not set then
         * DefaultValidatorResourceResolverFactory is used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.validator.ValidatorResourceResolverFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder resourceResolverFactory(
                Object resourceResolverFactory) {
            setProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * For creating a resource resolver which depends on the endpoint
         * resource URI. Must not be used in combination with method
         * setResourceResolver(LSResourceResolver). If not set then
         * DefaultValidatorResourceResolverFactory is used.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.validator.ValidatorResourceResolverFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder resourceResolverFactory(
                String resourceResolverFactory) {
            setProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option is a: <code>javax.xml.validation.SchemaFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder schemaFactory(Object schemaFactory) {
            setProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option will be converted to a
         * <code>javax.xml.validation.SchemaFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder schemaFactory(String schemaFactory) {
            setProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * Configures the W3C XML Schema Namespace URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder schemaLanguage(String schemaLanguage) {
            setProperty("schemaLanguage", schemaLanguage);
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
        default AdvancedMsvEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedMsvEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder useSharedSchema(
                boolean useSharedSchema) {
            setProperty("useSharedSchema", useSharedSchema);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMsvEndpointBuilder useSharedSchema(
                String useSharedSchema) {
            setProperty("useSharedSchema", useSharedSchema);
            return this;
        }
    }
    /**
     * MSV (camel-msv)
     * Validates the payload of a message using the MSV Library.
     * 
     * Category: validation
     * Available as of version: 1.1
     * Maven coordinates: org.apache.camel:camel-msv
     * 
     * Syntax: <code>msv:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * URL to a local resource on the classpath,or a reference to lookup a bean
     * in the Registry, or a full URL to a remote resource or resource on the
     * file system which contains the XSD to validate against.
     */
    default MsvEndpointBuilder msv(String path) {
        class MsvEndpointBuilderImpl extends AbstractEndpointBuilder implements MsvEndpointBuilder, AdvancedMsvEndpointBuilder {
            public MsvEndpointBuilderImpl(String path) {
                super("msv", path);
            }
        }
        return new MsvEndpointBuilderImpl(path);
    }
}