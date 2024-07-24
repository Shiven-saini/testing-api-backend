package me.shiven.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import me.shiven.model.quotes
import me.shiven.model.todos

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        // checking out code, eh? Nothing just some plain HTTP's Get Points here!
        get("/quote") {
            call.respond(quotes.random())
        }
        get("/quotes") {
            call.respond(quotes)
        }
        get("/todo") {
            call.respond(todos.random())
        }
        get("/todos") {
            call.respond(todos)
        }
    }
}
