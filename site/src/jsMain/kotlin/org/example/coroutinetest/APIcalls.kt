package org.example.coroutinetest

import com.varabyte.kobweb.browser.api
import kotlinx.browser.window


suspend fun getInt(): String? {
    return try {
        val response = window.api.tryGet("myapi?myInt=1")
        println("response is $response")
        response!!.decodeToString()
    } catch (e: Exception) {
        println("Couldn't get int")
        null
    }
}

