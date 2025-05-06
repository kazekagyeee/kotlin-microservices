package com.kazekagyee.notificationservice.domain.service

import org.springframework.stereotype.Service

@Service
class NotificationService {

    fun processN(n: Int): Int {
         if (n == 0) {
              //todo
         }
         return n - 1
    }
}