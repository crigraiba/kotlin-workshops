package com.learning.service

import com.learning.domain.Employee
import com.learning.extension.toEmployee
import com.learning.extension.toValue
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Service

@Service
class EmployeeService(
  private val redisTemplate: StringRedisTemplate
) {

  fun save(requestBody: Employee) =
    redisTemplate.opsForValue().set("Employee:${requestBody.id}", requestBody.toValue())

  fun findById(id: Int): Employee =
    redisTemplate.opsForValue().get("Employee:${id}")?.toEmployee() ?: throw RuntimeException()
}
