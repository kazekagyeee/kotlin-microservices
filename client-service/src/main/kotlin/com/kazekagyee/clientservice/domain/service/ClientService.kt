package com.kazekagyee.clientservice.domain.service

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class ClientService(
    private val webClient : WebClient
) {

    fun startSequence(n: Int) {
        webClient.get()
            .uri("/first-service/$n")
    }
}