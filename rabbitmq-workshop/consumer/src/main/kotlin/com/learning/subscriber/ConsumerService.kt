package com.learning.subscriber

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class ConsumerService {

  private val log = LoggerFactory.getLogger(javaClass)

  @RabbitListener(queues = ["my-queue"])
  fun consume(message: String) {
    log.info("ConsumerService#consume, message = $message")
  }
}