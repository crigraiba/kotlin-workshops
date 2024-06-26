package com.learning.controller

import com.learning.domain.Employee
import com.learning.service.EmployeeService
import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeeController(
    private val employeeService: EmployeeService
) {

  private val log = LoggerFactory.getLogger(javaClass)

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  fun save(@Valid @RequestBody requestBody: Employee) {
    log.info("EmployeeController#save, requestBody = $requestBody")
    employeeService.save(requestBody)
  }

  @GetMapping("/{id}")
  fun findById(@PathVariable id: Int): Employee {
    log.info("EmployeeController#findById, id = $id")
    return employeeService.findById(id)
  }
}
