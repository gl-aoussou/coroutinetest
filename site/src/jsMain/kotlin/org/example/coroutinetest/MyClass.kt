package org.example.coroutinetest

import androidx.compose.runtime.collectAsState
import kotlinx.browser.window
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MyClass {

    private val _state = MutableStateFlow(MyState())
    val state = _state.asStateFlow()

//    private val coroutineScope = CoroutineScope(window.asCoroutineDispatcher())
//    private val coroutineScope = CoroutineScope(Dispatchers.Unconfined)
//    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    private val coroutineScope = CoroutineScope(Dispatchers.Default)

    init {
        coroutineScope.launch {
            updateInt()
        }
    }

    private suspend fun updateInt() {

        val myInt = getInt()
        _state.update { it.copy(displayInt = myInt!!.toInt()) }

    }

}