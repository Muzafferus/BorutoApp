package com.muzafferus.borutoapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.muzafferus.borutoapp.data.local.BorutoDatabase
import com.muzafferus.borutoapp.data.paging_source.HeroRemoteMediator
import com.muzafferus.borutoapp.data.paging_source.SearchHeroesSource
import com.muzafferus.borutoapp.data.remote.BorutoApi
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.repository.RemoteDataSource
import com.muzafferus.borutoapp.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val borutoApi: BorutoApi,
    private val borutoDatabase: BorutoDatabase
) : RemoteDataSource {

    private val heroDao = borutoDatabase.heroDao()


    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(query: String): Flow<PagingData<Hero>> {
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            pagingSourceFactory = {
                SearchHeroesSource(borutoApi = borutoApi, query = query)
            }
        ).flow
    }
}