package com.learning.subscriber

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener

class ConsumerService {

    private val log = LoggerFactory.getLogger(javaClass)

    @RabbitListener(queues = ["queue"])
    fun consume(message: String) {
        log.info("ConsumerService#consume, message = $message")
    }
}