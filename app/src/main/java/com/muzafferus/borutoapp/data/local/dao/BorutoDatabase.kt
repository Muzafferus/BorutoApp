package com.muzafferus.borutoapp.data.local.dao

import androidx.room.Database
import com.muzafferus.borutoapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase {

    abstract fun heroDao(): HeroDao

}