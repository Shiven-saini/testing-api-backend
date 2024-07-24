package me.shiven.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.shiven.model.quotes

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/quote") {
            call.respond(quotes.random())
        }
        get("/quotes") {
            call.respond(quotes)
        }
    }
}
