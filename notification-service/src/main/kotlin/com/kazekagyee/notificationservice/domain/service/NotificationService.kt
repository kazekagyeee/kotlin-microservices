package com.kazekagyee.notificationservice.domain.service

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class NotificationService {

    fun processN(n: Int): Int {
         if (n == 0) {
              //todo
         }
         return n - 1
    }
}