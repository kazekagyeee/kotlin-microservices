package com.kazekagyee.clientservice.domain.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ClientService(
    private val restTemplate: RestTemplate
) {

    fun startSequence(n: Int) {
        restTemplate.getForObject(
            "http://localhost:8083/first-service/$n",
            Void::class.java
        )
    }
}