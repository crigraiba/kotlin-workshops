package com.learning.extension

import com.learning.domain.Employee
import com.learning.domain.entity.EmployeeDatabaseEntity

fun Employee.toEmployeeDatabaseEntity(): EmployeeDatabaseEntity = EmployeeDatabaseEntity(
    name = this.name,
    age = this.age,
    job = this.job,
    height = this.height,
    weight = this.weight
)

fun EmployeeDatabaseEntity.toEmployee(): Employee = Employee(
    id = this.id,
    name = this.name,
    age = this.age,
    job = this.job,
    height = this.height,
    weight = this.weight
)
