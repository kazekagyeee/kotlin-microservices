package com.kazekagyee.orderservice.domain.controller

import com.kazekagyee.orderservice.domain.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order-service")
class OrderServiceController(private val service: OrderService) {

    @GetMapping("/{n}")
    fun processN(@PathVariable n: Int): Int {
        return service.processN(n)
    }
}