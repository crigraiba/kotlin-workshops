package com.learning.domain

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class Employee(
    @field:NotNull
    val id: Int,
    @field:NotBlank
    val name: String,
    @field:Min(16)
    @field:Max(65)
    val age: Int
)
