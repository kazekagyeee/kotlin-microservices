package com.kazekagyee.firstservice.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaEventListener {
    @KafkaListener(topics = ["first"], groupId = "first-service-group")
    fun handleEvent(event: String) {
        //TODO
    }
}