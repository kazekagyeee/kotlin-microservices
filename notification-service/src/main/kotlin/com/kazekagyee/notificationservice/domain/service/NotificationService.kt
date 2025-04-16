package com.kazekagyee.notificationservice.domain.service

import lombok.AccessLevel
import lombok.RequiredArgsConstructor
import lombok.experimental.FieldDefaults
import org.springframework.stereotype.Service

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
class NotificationService {

    fun processN(n: Int): Int {
         if (n == 0) {
              //todo
         }
         return n - 1
    }
}