package com.learning.domain

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class Employee(
    val id: Int? = null,
    @field:NotBlank
    val name: String,
    @field:Min(16)
    @field:Max(65)
    val age: Int
)
