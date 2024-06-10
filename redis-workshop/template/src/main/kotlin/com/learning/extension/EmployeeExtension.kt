package com.learning.extension

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.learning.domain.Employee

private val objectMapper = jacksonObjectMapper()

fun Employee.toValue(): String =
  objectMapper.writeValueAsString(this)

fun String.toEmployee(): Employee =
  objectMapper.readValue<Employee>(this)