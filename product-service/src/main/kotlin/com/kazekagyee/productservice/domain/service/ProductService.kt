package com.kazekagyee.productservice.domain.service

import org.springframework.stereotype.Service

@Service
class ProductService {

    fun processN(n: Int): Int {
        if (n == 0) {
            //todo
        }
        return n - 1
    }
}