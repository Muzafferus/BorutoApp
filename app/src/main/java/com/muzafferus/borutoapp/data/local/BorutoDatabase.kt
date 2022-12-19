package com.muzafferus.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.muzafferus.borutoapp.data.local.dao.HeroDao
import com.muzafferus.borutoapp.data.local.dao.HeroRemoteKeysDao
import com.muzafferus.borutoapp.domain.model.Hero
import com.muzafferus.borutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 2)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}