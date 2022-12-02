package com.muzafferus.borutoapp.data.local.dao

import androidx.room.Database
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}