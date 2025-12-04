package com.jaamcoding.composemaster.basic_layout

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jaamcoding.composemaster.ui.theme.ComposeMasterTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemo() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("TopAppBar")
            }, navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Go back")
                }
            }, actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account")
                }
            })
        },
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(selected = true, onClick = { }, icon = {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Go")
                }, label = { Text("Home") })
                NavigationBarItem(selected = true, onClick = { }, icon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Go")
                }, label = { Text("Search") })
                NavigationBarItem(selected = true, onClick = { }, icon = {
                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "Go")
                }, label = { Text("Favorites") })
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                scope.launch {
                    snackbarHostState.showSnackbar(message = "Click on add")
                }
            }
            ) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Add")
            }
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color.Red)) {
            Text("Hello folks!")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ScaffoldDemoPrev() {
    ComposeMasterTheme {
        ScaffoldDemo()
    }
}
