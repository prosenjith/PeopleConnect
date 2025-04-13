package com.example.backend.routes

import com.example.backend.models.User
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userRoutes() {
    route("/user") {
        get {
            val user = User(1, "Shuvo", "shuvo@example.com")
            call.respond(user)
        }
    }
}
