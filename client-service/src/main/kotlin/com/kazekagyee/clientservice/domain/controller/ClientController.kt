package com.kazekagyee.clientservice.domain.controller

import com.kazekagyee.clientservice.domain.service.ClientService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client-service")
class ClientController(
    private val clientService: ClientService
) {
    @GetMapping("/start-sequence/{n}")
    fun startSequence(@PathVariable n : Int) {
        clientService.startSequence(n)
    }
}