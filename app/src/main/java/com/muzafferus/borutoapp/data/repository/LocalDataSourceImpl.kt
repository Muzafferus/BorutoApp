package com.muzafferus.borutoapp.data.repository

import com.muzafferus.borutoapp.data.local.BorutoDatabase
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(
    borutoDatabase: BorutoDatabase
) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId)
    }
}