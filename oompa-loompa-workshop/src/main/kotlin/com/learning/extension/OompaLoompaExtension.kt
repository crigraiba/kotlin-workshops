package com.learning.extension

import com.learning.domain.OompaLoompaDatabaseEntity
import com.learning.domain.OompaLoompa

fun OompaLoompa.toOompaLoompaDbEntity(): OompaLoompaDatabaseEntity = OompaLoompaDatabaseEntity(
    name = this.name,
    age = this.age,
    job = this.job,
    height = this.height,
    weight = this.weight
)

fun OompaLoompaDatabaseEntity.toOompaLoompa(): OompaLoompa = OompaLoompa(
    id = this.id,
    name = this.name,
    age = this.age,
    job = this.job,
    height = this.height,
    weight = this.weight
)
