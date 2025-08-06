package com.kazekagyee.thirdservice.kafka

import com.kazekagyee.thirdservice.domain.service.ThirdService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener(
    private val service: ThirdService
) {
    @KafkaListener(topics = ["third"], groupId = "third-service-group")
    fun handleEvent(event: String) {
        val n = event.toInt()
        println("📩 ThirdService received: $n")
        service.processN(n)
    }
}