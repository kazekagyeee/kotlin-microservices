package com.kazekagyee.firstservice.domain.service

import org.springframework.stereotype.Service

@Service
class FirstService {

    fun processN(n: Int): Int {
         if (n == 0) {
              //todo
         }
         return n - 1
    }
}