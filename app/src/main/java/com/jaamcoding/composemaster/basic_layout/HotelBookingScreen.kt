package com.jaamcoding.composemaster.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.composemaster.R
import com.jaamcoding.composemaster.ui.theme.ComposeMasterTheme

@Composable
fun HotelBookingScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        item {
            Box() {
                Image(painterResource(R.drawable.living_room), contentDescription = null)
                HotelFadedBanner(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HotelFadedBanner(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(Color.White.copy(alpha = 0.7f))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Column(

            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .background(Color.Red)
                .weight(1f)

        ) {
            Text(
                "Hotel California Strawberry",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            LabeledIcon(text = "Los Angeles, California", icon = {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.DarkGray
                )
            })
            LabeledIcon(text = "4.9 (13k Reviews)", icon = {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color.Yellow
                )
            })
        }
        Text(text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)) {
                append("420$/")
            }
            withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold, fontSize = 14.sp)) {
                append("night")
            }
        })
    }
}

@Preview(showBackground = true)
@Composable
private fun LabeledIcon(
    text: String = "Proof",
    icon: @Composable () -> Unit = {
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = null
        )
    },
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        icon()
        Text(text = text, fontSize = 13.sp)
    }

}


@Preview(showBackground = true)
@Composable
private fun HotelBookingScreenPrev() {
    ComposeMasterTheme {
        HotelBookingScreen()
    }
}