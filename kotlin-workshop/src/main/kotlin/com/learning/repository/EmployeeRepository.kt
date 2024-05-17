package com.learning.repository

import com.learning.domain.entity.EmployeeDatabaseEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<EmployeeDatabaseEntity, Int> {

    fun findFirstByName(name: String): EmployeeDatabaseEntity?
}
