package com.example.taskany.presentation.ui.custom_views

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.taskany.R
import com.example.taskany.presentation.constants.NavigationStates
import com.example.taskany.presentation.navigation.LocalNavController
import com.example.taskany.presentation.navigation.Route

@Composable
fun CommonBottomBar(state: Int) {
    val navController = LocalNavController.current!!
    var _state by remember { mutableIntStateOf(state) }

    NavigationBar {
        NavigationBarItem(
            selected = _state == NavigationStates.Somthng.ordinal,
            onClick = { _state = NavigationStates.Somthng.ordinal },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_edit_20),
                    contentDescription = "Calendar"
                )
            },
            label = {
                Text(text = "item 1")
            },
            alwaysShowLabel = false
        )
        NavigationBarItem(
            selected = _state == NavigationStates.Lists.ordinal,
            onClick = {
                _state = NavigationStates.Lists.ordinal
                navController.navigate(Route.ListsScreen.path)
            },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_list_24),
                    contentDescription = "Notes"
                )
            },
            label = {
                Text(text = "item 2")
            },
            alwaysShowLabel = false
        )
        NavigationBarItem(
            selected = _state == NavigationStates.Tasks.ordinal,
            onClick = {
                _state = NavigationStates.Tasks.ordinal
                navController.navigate(Route.TasksScreen.path)
            },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_24),
                    contentDescription = "Home"
                )
            },
            label = {
                Text(text = "Home")
            },
            alwaysShowLabel = false
        )
        NavigationBarItem(
            selected = _state == NavigationStates.Calendar.ordinal,
            onClick = {
                _state = NavigationStates.Calendar.ordinal
                navController.navigate(Route.CalendarScreen.path)
            },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_calendar_24),
                    contentDescription = "Calendar"
                )
            },
            label = {
                Text(text = "Calendar")
            },
            alwaysShowLabel = false
        )
        NavigationBarItem(
            selected = _state == NavigationStates.Settings.ordinal,
            onClick = {
                _state = NavigationStates.Settings.ordinal
                navController.navigate(Route.SettingsScreen.path)
            },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_settings_24),
                    contentDescription = "Settings"
                )
            },
            label = {
                Text(text = "item 5")
            },
            alwaysShowLabel = false
        )
    }
}