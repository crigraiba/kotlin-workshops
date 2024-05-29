package com.learning.publisher

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/messages")
class ProducerController(
    private val rabbitTemplate: RabbitTemplate
) {

    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun produce(@RequestBody message: String) {
        log.info("ProducerController#produce, message = $message")
        rabbitTemplate.convertAndSend("my-exchange", "my-routing-key", message)
    }
}