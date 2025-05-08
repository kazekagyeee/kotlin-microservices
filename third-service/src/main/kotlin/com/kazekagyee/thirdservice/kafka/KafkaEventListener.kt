package com.kazekagyee.thirdservice.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener {
    @KafkaListener(topics = ["third"], groupId = "third-service-group")
    fun handleEvent(event: String) {
        //TODO
    }
}