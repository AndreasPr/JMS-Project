package andreasgroup.jms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

/**
 * Created on 11/Nov/2020 to jms
 */
@Configuration
public class JmsConfig {

    public static final String MY_QUEUE = "my-hello-world";

    // It enables the Spring instance to take the JMS messages and flip those to
    // a JSON message and then can read that JMS message as a JMS text message and convert it back to JAVA Object
    @Bean
    public MessageConverter messageConverter(){
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }



}
