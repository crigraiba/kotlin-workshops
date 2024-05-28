package com.learning.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class EmployeeDatabaseEntity(
    @Id
    @GeneratedValue
    val id: Int = 0,
    val name: String,
    val age: Int,
    val job: String,
    val height: Double,
    val weight: Double
)
