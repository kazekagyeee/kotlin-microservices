package com.kazekagyee.thirdservice.kafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaEventProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {
    fun sendEvent(topic: String, event: String) {
        kafkaTemplate.send(topic, event)
    }
}
