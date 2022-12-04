package com.muzafferus.borutoapp.presentation.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.muzafferus.borutoapp.presentation.components.RatingWidget
import com.muzafferus.borutoapp.ui.theme.LARGE_PADDING

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {

    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()

    Scaffold(topBar = {
        HomeTopBar(onSearchClicked = {
            //OnClickTopBarSearch - Navigate to SearchScreen
        })
    }) {
        RatingWidget(modifier = Modifier.padding(all = LARGE_PADDING), rating = 2.6)
    }


}