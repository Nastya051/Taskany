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

@Composable
fun CommonBottomBar() {
    var _state by remember { mutableIntStateOf(3) }

    NavigationBar {
        NavigationBarItem(
            selected = _state == 1,
            onClick = { _state = 1 },
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
            selected = _state == 2,
            onClick = { _state = 2 },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_bell_24),
                    contentDescription = "Calendar"
                )
            },
            label = {
                Text(text = "item 2")
            },
            alwaysShowLabel = false
        )
        NavigationBarItem(
            selected = _state == 3,
            onClick = { _state = 3 },
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
            selected = _state == 4,
            onClick = { _state = 4 },
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
            selected = _state == 5,
            onClick = { _state = 5 },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_alarm_24),
                    contentDescription = "Calendar"
                )
            },
            label = {
                Text(text = "item 5")
            },
            alwaysShowLabel = false
        )
    }
}