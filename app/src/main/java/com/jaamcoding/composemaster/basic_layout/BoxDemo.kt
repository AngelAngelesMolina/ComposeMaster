package com.jaam.coding.ComposeMaster.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaam.coding.ComposeMaster.R
import com.jaam.coding.ComposeMaster.ui.theme.ComposeMasterTheme

@Composable
fun BoxDemo(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.size(200.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .matchParentSize() //this one only available for boxScope
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black)
                    )
                )
        )
        IconButton(onClick = { }, modifier = Modifier.align(Alignment.BottomEnd)) {

            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.White)
        }
    }


}

@Preview(showBackground = true)
@Composable
private fun BoxDemoPrev() {
    ComposeMasterTheme {
        BoxDemo()
    }
}