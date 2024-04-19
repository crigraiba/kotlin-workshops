package com.learning.controller

import com.learning.domain.OompaLoompa
import com.learning.service.OompaLoompaService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/oompa-loompas")
class OompaLoompaController(
    private val oompaLoompaService: OompaLoompaService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@Valid @RequestBody requestBody: OompaLoompa) =
        oompaLoompaService.save(requestBody)

    @GetMapping
    fun findAll(): List<OompaLoompa> =
        oompaLoompaService.findAll()
}
