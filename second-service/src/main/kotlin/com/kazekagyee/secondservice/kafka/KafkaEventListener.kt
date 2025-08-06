package com.kazekagyee.secondservice.kafka

import com.kazekagyee.secondservice.domain.service.SecondService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener(
    private val service: SecondService
) {
    @KafkaListener(topics = ["second"], groupId = "second-service-group")
    fun handleEvent(event: String) {
        val n = event.toInt()
        println("📩 SecondService received: $n")
        service.processN(n)
    }
}