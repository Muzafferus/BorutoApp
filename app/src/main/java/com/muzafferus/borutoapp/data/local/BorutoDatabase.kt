package com.muzafferus.borutoapp.data.local

import androidx.room.Database
import androidx.room.TypeConverters
import com.muzafferus.borutoapp.data.local.dao.HeroDao
import com.muzafferus.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}