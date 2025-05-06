package com.kazekagyee.firstservice.domain.controller

import com.kazekagyee.firstservice.domain.service.FirstService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first-service")
class FirstServiceController(private val service: FirstService) {

    @GetMapping("/{n}")
    fun processN(@PathVariable n: Int): Int {
        return service.processN(n)
    }
}