package com.muzafferus.borutoapp.data.repository

import androidx.paging.PagingData
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.repository.DataStoreOperations
import com.muzafferus.borutoapp.domain.repository.LocalDataSource
import com.muzafferus.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val local: LocalDataSource,
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {

    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remote.getAllHeroes()
    }

    fun searchHeroes(query: String): Flow<PagingData<Hero>> {
        return remote.searchHeroes(query)
    }

    suspend fun getSelectedHero(heroId: Int): Hero {
        return local.getSelectHero(heroId = heroId)
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }
}