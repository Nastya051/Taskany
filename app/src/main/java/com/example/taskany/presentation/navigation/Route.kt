package com.example.taskany.presentation.navigation

sealed class Route(val path: String) {

    data object ListsScreen : Route(path = "lists_screen")

    data object TasksScreen : Route(path = "tasks_screen")

    data object CalendarScreen : Route(path = "calendar_screen")

    data object SettingsScreen : Route(path = "settings_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}