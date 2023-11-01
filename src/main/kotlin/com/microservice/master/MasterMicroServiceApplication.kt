package com.microservice.master

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MasterMicroServiceApplication

fun main(args: Array<String>) {
    runApplication<MasterMicroServiceApplication>(*args)
}
