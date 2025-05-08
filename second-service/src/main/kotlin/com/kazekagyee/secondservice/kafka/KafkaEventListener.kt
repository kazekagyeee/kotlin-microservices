package com.kazekagyee.secondservice.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener {
    @KafkaListener(topics = ["second"], groupId = "second-service-group")
    fun handleEvent(event: String) {
        //TODO
    }
}