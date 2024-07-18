package com.example.taskany.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.taskany.presentation.constants.NavigationStates
import com.example.taskany.presentation.ui.custom_views.CommonBottomBar

@Composable
fun SettingsScreen(){
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp), horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Top bar")
            }
        },
        bottomBar = {
            CommonBottomBar(NavigationStates.Settings.ordinal)
        },
        containerColor = MaterialTheme.colorScheme.secondary
    ){
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ){
            item { Text(text = "Общие") }
            item { Text(text = "Инструменты") }
            item { Text(text = "Информация") }
        }
    }
}