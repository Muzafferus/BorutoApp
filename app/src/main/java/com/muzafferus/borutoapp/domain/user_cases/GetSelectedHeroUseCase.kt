package com.muzafferus.borutoapp.domain.user_cases

import com.muzafferus.borutoapp.data.repository.Repository
import com.muzafferus.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}