package com.learning.domain

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Positive

data class Employee(
    val id: Int? = null,
    @field:NotBlank
    val name: String,
    @field:Min(18)
    @field:Max(64)
    val age: Int,
    @field:NotBlank
    val job: String,
    @field:Positive
    val height: Double,
    @field:Positive
    val weight: Double
)
