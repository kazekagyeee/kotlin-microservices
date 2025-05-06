package com.kazekagyee.orderservice.domain.service

import org.springframework.stereotype.Service

@Service
class OrderService {

    fun processN(n: Int): Int {
        if (n == 0) {
            //todo
        }
        return n - 1
    }
}