package com.mrc.yg.api.rabitmq;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* * publisher, subscriber 모두에게 적용되는 내용. */
@Configuration
public class PubsubConfig {
    // exchange 정의.
    @Bean
    public FanoutExchange exchange() {
        return new FanoutExchange(RabbitMqConstants.EXCHANGE_NAME);
    }

    @Bean
    public Jackson2JsonMessageConverter jackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}

