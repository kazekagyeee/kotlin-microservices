package com.kazekagyee.firstservice.domain.service

import com.kazekagyee.firstservice.kafka.KafkaEventProducer
import org.springframework.stereotype.Service

@Service
class FirstService(
    private val kafkaEventProducer: KafkaEventProducer
) {

    fun processN(n: Int) {
        if (n == 0) {
            //todo
        }
        val nextN = n - 1
        kafkaEventProducer.sendEvent("first", nextN.toString())
    }
}