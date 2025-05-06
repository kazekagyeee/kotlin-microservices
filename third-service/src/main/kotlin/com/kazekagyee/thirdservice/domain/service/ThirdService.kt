package com.kazekagyee.thirdservice.domain.service

import org.springframework.stereotype.Service

@Service
class ThirdService {

    fun processN(n: Int): Int {
        if (n == 0) {
            //todo
        }
        return n - 1
    }
}