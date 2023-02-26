package com.kgh.listapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kgh.listapp.dao.TodoDao
import com.kgh.listapp.dto.Todo

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDao
}