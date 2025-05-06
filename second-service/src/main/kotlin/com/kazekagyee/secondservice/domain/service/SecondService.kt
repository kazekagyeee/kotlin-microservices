package com.kazekagyee.secondservice.domain.service

import org.springframework.stereotype.Service

@Service
class SecondService {

    fun processN(n: Int): Int {
        if (n == 0) {
            //todo
        }
        return n - 1
    }
}