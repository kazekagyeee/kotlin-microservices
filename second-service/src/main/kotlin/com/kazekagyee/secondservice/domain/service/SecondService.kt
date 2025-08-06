package com.kazekagyee.secondservice.domain.service

import com.kazekagyee.secondservice.kafka.KafkaEventProducer
import org.springframework.stereotype.Service

@Service
class SecondService(
    private val kafkaEventProducer: KafkaEventProducer
) {

    fun processN(n: Int) {
        if (n == 0) {
            println("Cycle stopped in second service")
            return
        }
        val nextN = n - 1
        kafkaEventProducer.sendEvent("third", nextN.toString())
    }
}