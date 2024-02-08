package org.example.coroutinetest

import com.varabyte.kobweb.browser.api
import kotlinx.browser.window


suspend fun getInt(): String {

        val response = window.api.tryGet("myapi?myInt=1")
        println("response is $response")


    return ""
}

