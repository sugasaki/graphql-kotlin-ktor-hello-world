package com.example.plugins

import com.fasterxml.jackson.databind.*
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.jackson.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    routing {
        get("/json/jackson") {
            call.respond(mapOf("hello" to "world"))
        }
    }
}
