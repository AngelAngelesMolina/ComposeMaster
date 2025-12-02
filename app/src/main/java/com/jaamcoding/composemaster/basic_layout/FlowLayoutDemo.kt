package com.jaam.coding.ComposeMaster.basic_layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaam.coding.ComposeMaster.ui.theme.ComposeMasterTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowLayoutDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(
            space = 40.dp,
            alignment = Alignment.CenterHorizontally
        ),
        //maxlines
        //maxItemsInEachRow = 3, //max in each row
        //verticalArrangement = Arrangement.SpaceBetween //we can order here because we can have n rows
    ) { // fits as much items as it can
        for (i in 1..30)
            AssistChip(onClick = { }, label = {
                Text(text = "Item $i")
            })
    }
}

@Preview(showBackground = true)
@Composable
private fun FlowLayoutDemoPrev() {
    ComposeMasterTheme {
        FlowLayoutDemo()
    }
}