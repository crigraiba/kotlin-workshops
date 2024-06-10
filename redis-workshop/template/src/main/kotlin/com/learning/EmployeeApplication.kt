package com.learning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@SpringBootApplication
@EnableRedisRepositories
class EmployeeApplication

fun main(args: Array<String>) {
  runApplication<EmployeeApplication>(*args)
}
