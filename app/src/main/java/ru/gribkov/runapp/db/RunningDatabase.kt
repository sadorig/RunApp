package ru.gribkov.runapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.gribkov.runapp.db.Converters
import ru.gribkov.runapp.db.Run
import ru.gribkov.runapp.db.RunDAO

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}