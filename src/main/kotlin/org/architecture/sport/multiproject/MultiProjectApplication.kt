package org.architecture.sport.multiproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiProjectApplication

fun main(args: Array<String>) {
    runApplication<MultiProjectApplication>(*args)
}
