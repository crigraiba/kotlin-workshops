package com.learning.service

import com.learning.domain.Employee
import com.learning.extension.toEmployee
import com.learning.extension.toEmployeeDatabaseEntity
import com.learning.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository
) {

  fun save(requestBody: Employee) {
    if (employeeRepository.existsByName(requestBody.name)) {
      throw RuntimeException("Employee already exists")
    }
    employeeRepository.save(requestBody.toEmployeeDatabaseEntity())
  }

  fun findAll(): MutableList<Employee> =
      employeeRepository.findAll().stream().map { it.toEmployee() }.toList()
}
