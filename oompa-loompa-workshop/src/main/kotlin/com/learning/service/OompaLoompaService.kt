package com.learning.service

import com.learning.domain.OompaLoompa
import com.learning.extension.toOompaLoompa
import com.learning.extension.toOompaLoompaDbEntity
import com.learning.repository.OompaLoompaRepository
import org.springframework.stereotype.Service

@Service
class OompaLoompaService(
    private val oompaLoompaRepository: OompaLoompaRepository
) {

    fun save(requestBody: OompaLoompa) =
        findFirstByName(requestBody.name)?.let {
            throw RuntimeException("Oompa Loompa already exists")
        } ?: oompaLoompaRepository.save(requestBody.toOompaLoompaDbEntity())

    fun findAll(): MutableList<OompaLoompa> =
        oompaLoompaRepository.findAll().stream().map { it.toOompaLoompa() }.toList()

    fun findFirstByName(name: String): OompaLoompa? =
        oompaLoompaRepository.findFirstByName(name)?.toOompaLoompa()
}
