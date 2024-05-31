package com.learning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@SpringBootApplication
@EnableRedisRepositories
@EnableCaching
class EmployeeApplication

fun main(args: Array<String>) {
  runApplication<EmployeeApplication>(*args)
}
