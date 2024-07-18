package com.example.taskany.presentation.ui.custom_views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun NoteCard(modifier: Modifier = Modifier, /*заметка(заголовок, текст, дата)*/) {
    Card(
        onClick = { /*TODO*/ },//переход на экран просмотра/редактирования заметки
        modifier = modifier
            .heightIn(50.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
            ) {
                Text(
                    text = "Head text Head text Head text Head text Head text Head text",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.onTertiary,
                    modifier = Modifier.padding(all = 8.dp)
                )
            }
            Text(
                text = "Content text Content text dgdd \n Content text \n Content text \n" +
                        " Content text",
                maxLines = 4,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(all = 8.dp)
            )
            Text(
                text = "Date text",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }
    }
}