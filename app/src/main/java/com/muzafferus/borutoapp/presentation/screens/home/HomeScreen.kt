package com.muzafferus.borutoapp.presentation.screens.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Scaffold(topBar = {
        HomeTopBar(onSearchClicked = {
            //OnClickTopBarSearch - Navigate to SearchScreen
        })
    }) {

    }


}