package com.kazekagyee.secondservice.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig(
    @Value("\${my.kafka.topic.second.name}") private val topic: String,
    @Value("\${my.kafka.topic.second.partitions}") private val parts: Int,
    @Value("\${my.kafka.topic.second.replicas}") private val reps: Int
) {
    @Bean
    fun createTopic(): NewTopic {
        return TopicBuilder.name(topic)
            .partitions(parts)
            .replicas(reps)
            .build()
    }
}