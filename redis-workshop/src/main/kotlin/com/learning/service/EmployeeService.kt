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

    fun save(requestBody: Employee) =
        employeeRepository.save(requestBody.toEmployeeDatabaseEntity())

    fun findById(id: Int): Employee =
        employeeRepository.findById(id).orElseThrow().toEmployee()
}
