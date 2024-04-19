package com.learning.repository

import com.learning.domain.OompaLoompaDatabaseEntity
import org.springframework.data.jpa.repository.JpaRepository

interface OompaLoompaRepository : JpaRepository<OompaLoompaDatabaseEntity, Int> {

    fun findFirstByName(name: String): OompaLoompaDatabaseEntity?
}
