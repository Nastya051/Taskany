package com.example.taskany.presentation.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.taskany.presentation.constants.NavigationStates
import com.example.taskany.presentation.ui.custom_views.CommonBottomBar
import java.util.Calendar

@Composable
fun CalendarScreen(){
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
            CommonBottomBar(NavigationStates.Calendar.ordinal)
        },
        containerColor = MaterialTheme.colorScheme.secondary
    ){
//        val c = Calendar.getInstance()
//        Log.d("MyLog", c.time.toString())
//        DatePicker(state = )
    }
}