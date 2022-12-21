package com.muzafferus.borutoapp.domain.user_cases

import androidx.paging.PagingData
import com.muzafferus.borutoapp.data.repository.Repository
import com.muzafferus.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}