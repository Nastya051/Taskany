package com.example.taskany.presentation.navigation

sealed class Route(val path: String) {

    data object ListsScreen : Route(path = "lists_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}