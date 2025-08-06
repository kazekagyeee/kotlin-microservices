package com.kazekagyee.thirdservice.domain.service

import com.kazekagyee.thirdservice.kafka.KafkaEventProducer
import org.springframework.stereotype.Service

@Service
class ThirdService(
    private val kafkaEventProducer: KafkaEventProducer
) {

    fun processN(n: Int) {
        if (n == 0) {
            println("Cycle stopped in second service")
            return
        }
        val nextN = n - 1
        kafkaEventProducer.sendEvent("first", nextN.toString())
    }
}