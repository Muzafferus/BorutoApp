package com.muzafferus.borutoapp.domain.user_cases

import com.muzafferus.borutoapp.data.repository.Repository

class GetSelectedHeroUseCase(
    private val repository:Repository
) {
    suspend operator fun invoke(heroId:Int){
        repository.getSelectedHero(heroId = heroId)
    }
}