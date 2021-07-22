package io.coderade.developer.kotlinkafkaeventstreaming

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinKafkaEventStreamingApplication

fun main(args: Array<String>) {
	runApplication<KotlinKafkaEventStreamingApplication>(*args)
}
