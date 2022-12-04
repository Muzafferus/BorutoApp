package com.muzafferus.borutoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.muzafferus.borutoapp.domain.user_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel(){

    val getAllHeroes = useCases.getAllHeroesUseCase.invoke()



}