package com.muzafferus.borutoapp.domain.user_cases

import com.muzafferus.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository:Repository
) {
    suspend operator fun invoke(completed:Boolean){
        repository.saveOnBoardingState(completed = completed)
    }
}