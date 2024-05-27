package com.learning.domain.entity

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("Employee")
data class EmployeeDatabaseEntity(
    @Id
    val id: Int = 0,
    val name: String,
    val age: Int
)
