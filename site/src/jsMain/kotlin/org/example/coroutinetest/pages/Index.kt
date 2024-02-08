package org.example.coroutinetest.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.browser.api
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window

private suspend fun loadAndReplaceTodos() {
    println("request sent")
    val response = window.api.get("list?owner=$0")

    println("response is $response")

    println("response obtained")
}

private suspend fun getInt(): String {

    val response = window.api.tryGet("myapi?myInt=1")
    println("response is $response")


    return ""
}

@Page
@Composable
fun HomePage() {


    LaunchedEffect(Unit) {


        getInt()

    }


}
