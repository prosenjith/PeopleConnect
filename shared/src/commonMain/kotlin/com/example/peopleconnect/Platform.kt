package com.example.peopleconnect

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform