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
package org.apache.camel.kafkaconnector.sjms;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSjmsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_CONF = "camel.sink.path.destinationType";
    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_DOC = "The kind of destination to use One of: [queue] [topic]";
    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_DEFAULT = "queue";
    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_CONF = "camel.sink.path.destinationName";
    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_DOC = "DestinationName is a JMS queue or topic name. By default, the destinationName is interpreted as a queue name.";
    public static final String CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_CONF = "camel.sink.endpoint.acknowledgementMode";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_DOC = "The JMS acknowledgement name, which is one of: SESSION_TRANSACTED, CLIENT_ACKNOWLEDGE, AUTO_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE One of: [SESSION_TRANSACTED] [CLIENT_ACKNOWLEDGE] [AUTO_ACKNOWLEDGE] [DUPS_OK_ACKNOWLEDGE]";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_DEFAULT = "AUTO_ACKNOWLEDGE";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_CONF = "camel.sink.endpoint.namedReplyTo";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_DOC = "Sets the reply to destination name used for InOut producer endpoints. The type of the reply to destination can be determined by the starting prefix (topic: or queue:) in its name.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_CONF = "camel.sink.endpoint.persistent";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_DOC = "Flag used to enable/disable message persistence.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_CONF = "camel.sink.endpoint.producerCount";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_DOC = "Sets the number of producers used for this endpoint.";
    public static final Integer CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_DEFAULT = 1;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_TTL_CONF = "camel.sink.endpoint.ttl";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_TTL_DOC = "Flag used to adjust the Time To Live value of produced messages.";
    public static final Long CAMEL_SINK_SJMS_ENDPOINT_TTL_DEFAULT = -1L;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_CONF = "camel.sink.endpoint.allowNullBody";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_DOC = "Whether to allow sending messages with no body. If this option is false and the message body is null, then an JMSException is thrown.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_CONF = "camel.sink.endpoint.prefillPool";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_DOC = "Whether to prefill the producer connection pool on startup, or create connections lazy when needed.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_CONF = "camel.sink.endpoint.responseTimeOut";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_DOC = "Sets the amount of time we should wait before timing out a InOut response.";
    public static final Long CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_DEFAULT = 5000L;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_CONF = "camel.sink.endpoint.asyncStartListener";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_DOC = "Whether to startup the consumer message listener asynchronously, when starting a route. For example if a JmsConsumer cannot get a connection to a remote JMS broker, then it may block while retrying and/or failover. This will cause Camel to block while starting routes. By setting this option to true, you will let routes startup, while the JmsConsumer connects to the JMS broker using a dedicated thread in asynchronous mode. If this option is used, then beware that if the connection could not be established, then an exception is logged at WARN level, and the consumer will not be able to receive messages; You can then restart the route to retry.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_DEFAULT = false;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_CONF = "camel.sink.endpoint.asyncStopListener";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_DOC = "Whether to stop the consumer message listener asynchronously, when stopping a route.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_DEFAULT = false;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_CONF = "camel.sink.endpoint.connectionCount";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_DOC = "The maximum number of connections available to this endpoint";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_CONF = "camel.sink.endpoint.connectionFactory";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_DOC = "Initializes the connectionFactory for the endpoint, which takes precedence over the component's connectionFactory, if any";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_CONF = "camel.sink.endpoint.connectionResource";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_DOC = "Initializes the connectionResource for the endpoint, which takes precedence over the component's connectionResource, if any";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_CONF = "camel.sink.endpoint.destinationCreationStrategy";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_DOC = "To use a custom DestinationCreationStrategy.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_CONF = "camel.sink.endpoint.exceptionListener";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_DOC = "Specifies the JMS Exception Listener that is to be notified of any underlying JMS exceptions.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF = "camel.sink.endpoint.includeAllJMSXProperties";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC = "Whether to include all JMSXxxx properties when mapping from JMS to Camel Message. Setting this to true will include properties such as JMSXAppID, and JMSXUserID etc. Note: If you are using a custom headerFilterStrategy then this option does not apply.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT = false;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF = "camel.sink.endpoint.jmsKeyFormatStrategy";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC = "Pluggable strategy for encoding and decoding JMS keys so they can be compliant with the JMS specification. Camel provides two implementations out of the box: default and passthrough. The default strategy will safely marshal dots and hyphens (. and -). The passthrough strategy leaves the key as is. Can be used for JMS brokers which do not care whether JMS header keys contain illegal characters. You can provide your own implementation of the org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using the # notation.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_CONF = "camel.sink.endpoint.mapJmsMessage";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_DOC = "Specifies whether Camel should auto map the received JMS message to a suited payload type, such as javax.jms.TextMessage to a String etc. See section about how mapping works below for more details.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF = "camel.sink.endpoint.messageCreatedStrategy";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC = "To use the given MessageCreatedStrategy which are invoked when Camel creates new instances of javax.jms.Message objects when Camel is sending a JMS message.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_CONF = "camel.sink.endpoint.transactionCommitStrategy";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DOC = "Sets the commit strategy.";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_CONF = "camel.sink.endpoint.sharedJMSSession";
    public static final String CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_DOC = "Specifies whether to share JMS session with other SJMS endpoints. Turn this off if your route is accessing to multiple JMS providers. If you need transaction against multiple JMS providers, use jms component to leverage XA transaction.";
    public static final Boolean CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_CONF = "camel.component.sjms.connectionCount";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_DOC = "The maximum number of connections available to endpoints started under this component";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_DEFAULT = "1";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_CONF = "camel.component.sjms.connectionFactory";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_DOC = "A ConnectionFactory is required to enable the SjmsComponent. It can be set directly or set set as part of a ConnectionResource.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.sjms.lazyStartProducer";
    public static final String CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.sjms.autowiredEnabled";
    public static final String CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_CONF = "camel.component.sjms.connectionClientId";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_DOC = "The client ID to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_CONF = "camel.component.sjms.connectionMaxWait";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_DOC = "The max wait time in millis to block and wait on free connection when the pool is exhausted when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final Long CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_DEFAULT = 5000L;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_CONF = "camel.component.sjms.connectionResource";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_DOC = "A ConnectionResource is an interface that allows for customization and container control of the ConnectionFactory. See Plugable Connection Resource Management for further details.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_CONF = "camel.component.sjms.connectionTestOnBorrow";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_DOC = "When using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource then should each javax.jms.Connection be tested (calling start) before returned from the pool.";
    public static final Boolean CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_DEFAULT = true;
    public static final String CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_CONF = "camel.component.sjms.destinationCreationStrategy";
    public static final String CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_DOC = "To use a custom DestinationCreationStrategy.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_CONF = "camel.component.sjms.jmsKeyFormatStrategy";
    public static final String CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DOC = "Pluggable strategy for encoding and decoding JMS keys so they can be compliant with the JMS specification. Camel provides one implementation out of the box: default. The default strategy will safely marshal dots and hyphens (. and -). Can be used for JMS brokers which do not care whether JMS header keys contain illegal characters. You can provide your own implementation of the org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it using the # notation.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_CONF = "camel.component.sjms.messageCreatedStrategy";
    public static final String CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_DOC = "To use the given MessageCreatedStrategy which are invoked when Camel creates new instances of javax.jms.Message objects when Camel is sending a JMS message.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_CONF = "camel.component.sjms.timedTaskManager";
    public static final String CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_DOC = "To use a custom TimedTaskManager";
    public static final String CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.sjms.headerFilterStrategy";
    public static final String CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_CONF = "camel.component.sjms.connectionPassword";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_DOC = "The password to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_CONF = "camel.component.sjms.connectionUsername";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_DOC = "The username to use when creating javax.jms.Connection when using the default org.apache.camel.component.sjms.jms.ConnectionFactoryResource.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_CONF = "camel.component.sjms.transactionCommitStrategy";
    public static final String CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DOC = "To configure which kind of commit strategy to use. Camel provides two implementations out of the box, default and batch.";
    public static final String CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DEFAULT = null;

    public CamelSjmsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSjmsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_PATH_DESTINATION_TYPE_DOC);
        conf.define(CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SJMS_PATH_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_ACKNOWLEDGEMENT_MODE_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_NAMED_REPLY_TO_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_PERSISTENT_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_PRODUCER_COUNT_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_TTL_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SJMS_ENDPOINT_TTL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_TTL_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_ALLOW_NULL_BODY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_PREFILL_POOL_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_RESPONSE_TIME_OUT_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_ASYNC_START_LISTENER_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_ASYNC_STOP_LISTENER_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_COUNT_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_CONNECTION_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_DESTINATION_CREATION_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_EXCEPTION_LISTENER_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_INCLUDE_ALL_JMSXPROPERTIES_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_JMS_KEY_FORMAT_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_MAP_JMS_MESSAGE_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_MESSAGE_CREATED_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_TRANSACTION_COMMIT_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_ENDPOINT_SHARED_JMSSESSION_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_COUNT_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_FACTORY_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_CLIENT_ID_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_MAX_WAIT_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_TEST_ON_BORROW_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_DESTINATION_CREATION_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_JMS_KEY_FORMAT_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_MESSAGE_CREATED_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_TIMED_TASK_MANAGER_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_CONNECTION_USERNAME_DOC);
        conf.define(CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SJMS_COMPONENT_TRANSACTION_COMMIT_STRATEGY_DOC);
        return conf;
    }
}