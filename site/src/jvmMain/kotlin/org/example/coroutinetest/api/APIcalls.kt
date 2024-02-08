package org.example.coroutinetest.api

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

val myCoroutine = CoroutineScope(Dispatchers.IO)
@Api(routeOverride = "myapi")
fun getAllSessionsOfInstructor(ctx: ApiContext) {

    val myInt = ctx.req.params["myInt"]!!.toInt()

    ctx.logger.debug("get session of instructor $myInt")

    try {
        myCoroutine.launch {
            ctx.logger.debug("int is $myInt")
            ctx.res.setBodyText(myInt.toString())
        }
    } catch (e: Exception) {
        ctx.logger.debug(e.message?:"no error message")
    }
}