package com.muzafferus.borutoapp.domain.repository

import com.muzafferus.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectHero(heroId: Int): Hero
}