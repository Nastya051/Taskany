package com.example.taskany.presentation.navigation

sealed class Route(val path: String) {

//    data object StartScreen : Route(path = "start_screen_route")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}