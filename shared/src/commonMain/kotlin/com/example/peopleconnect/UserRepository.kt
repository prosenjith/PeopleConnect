package com.example.peopleconnect

import com.example.peopleconnect.model.User
import com.example.peopleconnect.network.ApiService


class UserRepository {
    private val api = ApiService()

    suspend fun getUser(): User = api.getUser()
}
