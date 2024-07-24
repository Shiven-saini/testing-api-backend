package me.shiven.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val greet_html = """
                <h1>Welcome to Shiven Saini's backend service!</h1>
                <h2>Built in Kotlin using Ktor framework!</h2>
                <p><strong>If you are using this you might be learning something new. Cool Stuff Indeed!!</strong></p>
                
                 <h2>Available API's Get Points</h2>
                 <ol>
                    <li><code>/todo</code> : Fetch a random todo item</li>
                    <li><code>/todos</code> : Fetch a list of all todo items available</li>
                    <li><code>/quote</code> : Fetch a random quote</li>
                    <li><code>/quotes</code> : Fetch a list of all quote items available</li>
                 </ol>
             
            """.trimIndent()
            val parser = ContentType.parse("text/html")
            call.respondText(greet_html, parser)
        }
        // Static plugin. Try to access `/static/index.html`

        // will be implemented later on as needed!!
        static("/static") {
            resources("static")
        }
    }
}
