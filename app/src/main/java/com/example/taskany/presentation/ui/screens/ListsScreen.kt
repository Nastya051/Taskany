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
import com.example.taskany.presentation.ui.custom_views.CommonBottomBar
import com.example.taskany.presentation.ui.custom_views.NoteCard

@Composable
fun ListsScreen() {
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
                    CommonBottomBar()
        },
        containerColor = MaterialTheme.colorScheme.secondary
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            for (i in 0..5 step 2) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        NoteCard(modifier = Modifier.weight(0.4f))
                        NoteCard(modifier = Modifier.weight(0.4f))
                    }
                }
            }
        }
    }
}