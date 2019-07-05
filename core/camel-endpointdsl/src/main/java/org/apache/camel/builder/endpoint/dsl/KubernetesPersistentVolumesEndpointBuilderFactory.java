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
 * The Kubernetes Persistent Volumes component provides a producer to execute
 * kubernetes persistent volume operations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesPersistentVolumesEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Kubernetes Persistent Volume component.
     */
    public interface KubernetesPersistentVolumesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKubernetesPersistentVolumesEndpointBuilder advanced() {
            return (AdvancedKubernetesPersistentVolumesEndpointBuilder) this;
        }
        /**
         * The Kubernetes API Version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder apiVersion(
                String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder dnsDomain(
                String dnsDomain) {
            setProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option is a:
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder kubernetesClient(
                Object kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option will be converted to a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder kubernetesClient(
                String kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder portName(
                String portName) {
            setProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesPersistentVolumesEndpointBuilder portProtocol(
                String portProtocol) {
            setProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder caCertData(
                String caCertData) {
            setProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder caCertFile(
                String caCertFile) {
            setProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientCertData(
                String clientCertData) {
            setProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientCertFile(
                String clientCertFile) {
            setProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientKeyAlgo(
                String clientKeyAlgo) {
            setProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientKeyData(
                String clientKeyData) {
            setProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientKeyFile(
                String clientKeyFile) {
            setProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder clientKeyPassphrase(
                String clientKeyPassphrase) {
            setProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder oauthToken(
                String oauthToken) {
            setProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder password(
                String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder trustCerts(
                Boolean trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder trustCerts(
                String trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesPersistentVolumesEndpointBuilder username(
                String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kubernetes Persistent Volume
     * component.
     */
    public interface AdvancedKubernetesPersistentVolumesEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KubernetesPersistentVolumesEndpointBuilder basic() {
            return (KubernetesPersistentVolumesEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesPersistentVolumesEndpointBuilder basicPropertyBinding(
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
        default AdvancedKubernetesPersistentVolumesEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesPersistentVolumesEndpointBuilder connectionTimeout(
                Integer connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesPersistentVolumesEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
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
        default AdvancedKubernetesPersistentVolumesEndpointBuilder synchronous(
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
        default AdvancedKubernetesPersistentVolumesEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Kubernetes Persistent Volume (camel-kubernetes)
     * The Kubernetes Persistent Volumes component provides a producer to
     * execute kubernetes persistent volume operations.
     * 
     * Category: container,cloud,paas
     * Available as of version: 2.17
     * Maven coordinates: org.apache.camel:camel-kubernetes
     * 
     * Syntax: <code>kubernetes-persistent-volumes:masterUrl</code>
     * 
     * Path parameter: masterUrl (required)
     * Kubernetes Master url
     */
    default KubernetesPersistentVolumesEndpointBuilder kubernetesPersistentVolumes(
            String path) {
        class KubernetesPersistentVolumesEndpointBuilderImpl extends AbstractEndpointBuilder implements KubernetesPersistentVolumesEndpointBuilder, AdvancedKubernetesPersistentVolumesEndpointBuilder {
            public KubernetesPersistentVolumesEndpointBuilderImpl(String path) {
                super("kubernetes-persistent-volumes", path);
            }
        }
        return new KubernetesPersistentVolumesEndpointBuilderImpl(path);
    }
}