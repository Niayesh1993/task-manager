package com.zozi.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zozi.data.local.model.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDatabase: RoomDatabase(){

    abstract fun taskDao() : TaskDao
}