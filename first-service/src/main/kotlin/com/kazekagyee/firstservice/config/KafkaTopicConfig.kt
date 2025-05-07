package com.kazekagyee.firstservice.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig(
    @Value("\${my.kafka.topic.first.name}") private val topic: String,
    @Value("\${my.kafka.topic.first.partitions}") private val parts: Int,
    @Value("\${my.kafka.topic.first.replicas}") private val reps: Int
) {
    @Bean
    fun createTopic(): NewTopic {
        return TopicBuilder.name(topic)
            .partitions(parts)
            .replicas(reps)
            .build()
    }
}