package com.example.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

// ktlint-disable no-wildcard-imports

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
