package com.jaamcoding.composemaster.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.composemaster.ui.theme.ComposeMasterTheme
import kotlin.random.Random

@Composable
fun LazyGridDemo() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Adaptive(50.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)

    ) {
        items(100) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color(Random.nextInt()))
            )
        }
    }
}

@Composable
fun LazyVerticalStaggered() { //this composable has mix heights
    LazyVerticalStaggeredGrid(
        modifier = Modifier.fillMaxSize(),
        columns = StaggeredGridCells.Fixed(5),
        verticalItemSpacing = 17.dp,
        horizontalArrangement = Arrangement.spacedBy(16.dp)

    ) {
        items(100) {
            Box(
                modifier = Modifier
                    .height(Random.nextInt(1, 200).dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(Random.nextInt()))
            )
        }
    }
}


@Preview
@Composable
private fun LazyGridDemoPrev() {
    ComposeMasterTheme {
        LazyGridDemo()
    }
}

@Preview
@Composable
private fun LazyGridStaggPrev() {
    ComposeMasterTheme {
        LazyVerticalStaggered()
    }
}