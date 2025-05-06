package com.kazekagyee.notificationservice.domain.controller

import com.kazekagyee.notificationservice.domain.service.NotificationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notification-service")
class NotificationController(private val service: NotificationService) {

    @GetMapping("/{n}")
    fun processN(@PathVariable n: Int): Int {
        return service.processN(n)
    }
}