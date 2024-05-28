package com.learning.configuration

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.Exchange
import org.springframework.amqp.core.ExchangeBuilder
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.QueueBuilder
import org.springframework.context.annotation.Bean

class QueueConfiguration {

    @Bean
    fun queue(): Queue =
        QueueBuilder
            .durable("my-queue")
            .lazy()
            .build()

    @Bean
    fun exchange(): Exchange =
        ExchangeBuilder
            .directExchange("my-exchange")
            .build()

    @Bean
    fun binding(): Binding =
        BindingBuilder
            .bind(queue())
            .to(exchange())
            .with("my-routing-key")
            .noargs()
}