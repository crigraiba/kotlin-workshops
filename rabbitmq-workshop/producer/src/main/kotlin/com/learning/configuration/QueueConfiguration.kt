package com.learning.configuration

import org.springframework.amqp.core.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
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