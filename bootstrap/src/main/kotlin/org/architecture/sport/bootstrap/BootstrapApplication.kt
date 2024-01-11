package org.architecture.sport.bootstrap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["org.architecture.sport"])
@EntityScan(basePackages = ["org.architecture.sport"])
class BootstrapApplication

fun main(args: Array<String>) {
    runApplication<BootstrapApplication>(*args)
}
