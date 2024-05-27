package com.learning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@EnableRedisRepositories
@SpringBootApplication
class EmployeeApplication

fun main(args: Array<String>) {
    runApplication<EmployeeApplication>(*args)
}
