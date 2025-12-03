package com.jaam.coding.ComposeMaster.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.composemaster.ui.theme.ComposeMasterTheme


@Composable
fun RowColumnDemo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
        //horizontalArrangement = Arrangement.SpaceAround
    ) {
        /*Text(
            text = "Hello world",
            fontSize = 40.sp, modifier = Modifier
                .width(150.dp)
                .alignBy(LastBaseline) //Align to the last element
        )
        Text(
            text = "Hello world",
            fontSize = 20.sp, modifier = Modifier
                .alignByBaseline()
        )*/

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .weight(2f)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .align(Alignment.CenterHorizontally)
                .weight(1f)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .weight(1f)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF)
@Composable
private fun RowColumnDemoPrev() {
    ComposeMasterTheme {
        RowColumnDemo()
    }
}