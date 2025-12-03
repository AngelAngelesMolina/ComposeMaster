package com.jaamcoding.composemaster.basic_layout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.composemaster.ui.theme.ComposeMasterTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyListColumn() {
    LazyColumn(modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        reverseLayout = true,
        verticalArrangement = Arrangement.spacedBy(26.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        items(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {

        }

        items(3) { i ->
            Text(text = "Item $i")
        }
//        stickyHeader {
//            Text(text = "Sticky Header",  modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Green))
//        }
//        items(100) { i ->
//            Text(text = "Item $i")
//        }
//        item {
//            Text(
//                text = "End Reached", modifier = Modifier
//                    .fillMaxWidth()
//                    .background(Color.Red), textAlign = TextAlign.Center
//            )
//        }
    }


}


@Preview(showBackground = true)
@Composable
private fun LazyListColumnPrev() {
    ComposeMasterTheme() {
        LazyListColumn()
    }
}