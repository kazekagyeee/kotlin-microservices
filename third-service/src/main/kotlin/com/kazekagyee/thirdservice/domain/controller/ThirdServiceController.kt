package com.kazekagyee.thirdservice.domain.controller

import com.kazekagyee.thirdservice.domain.service.ThirdService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product-service")
class ThirdServiceController(private val service: ThirdService) {

    @GetMapping("/{n}")
    fun processN(@PathVariable n: Int): Int {
        return service.processN(n)
    }
}