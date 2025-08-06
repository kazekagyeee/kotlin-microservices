package com.kazekagyee.firstservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstServiceApplication

fun main(args: Array<String>) {
    //runApplication<FirstServiceApplication>(*args)
    val app = SpringApplication(FirstServiceApplication::class.java)
    println("🔍 WEB APPLICATION TYPE: ${app.webApplicationType}")
    app.run(*args)
}