package org.example.coroutinetest.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import org.example.coroutinetest.MyClass
import org.example.coroutinetest.getInt
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

//    val myClass = MyClass()
//    val state = myClass.state.collectAsState()

//    Text(value = state.value.displayInt.toString())


    LaunchedEffect(key1 = Unit){
        println("TEST")
        getInt()
    }

}
