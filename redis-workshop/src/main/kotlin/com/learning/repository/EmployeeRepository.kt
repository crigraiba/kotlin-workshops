package com.learning.repository

import com.learning.domain.entity.EmployeeDatabaseEntity
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<EmployeeDatabaseEntity, Int>