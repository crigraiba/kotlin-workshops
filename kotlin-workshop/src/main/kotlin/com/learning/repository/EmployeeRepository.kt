package com.learning.repository

import com.learning.domain.entity.EmployeeDatabaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<EmployeeDatabaseEntity, Int> {

    fun existsByName(name: String): Boolean
}
