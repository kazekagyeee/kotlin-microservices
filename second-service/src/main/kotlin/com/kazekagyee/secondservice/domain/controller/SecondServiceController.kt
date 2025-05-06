package com.kazekagyee.secondservice.domain.controller

import com.kazekagyee.secondservice.domain.service.SecondService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/second-service")
class SecondServiceController(private val service: SecondService) {

    @GetMapping("/{n}")
    fun processN(@PathVariable n: Int): Int {
        return service.processN(n)
    }
}