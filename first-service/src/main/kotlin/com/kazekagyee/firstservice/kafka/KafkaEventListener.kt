package com.kazekagyee.firstservice.kafka

import com.kazekagyee.firstservice.domain.service.FirstService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener(
    private val service: FirstService
) {
    @KafkaListener(topics = ["first"], groupId = "first-service-group")
    fun handleEvent(event: String) {
        val n = event.toInt()
        println("📩 FirstService received: $n")
        service.processN(n)
    }
}