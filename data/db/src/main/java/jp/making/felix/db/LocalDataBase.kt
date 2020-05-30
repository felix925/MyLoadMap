package jp.making.felix.db

import androidx.room.Database
import androidx.room.RoomDatabase
import jp.making.felix.db.dao.PathDao
import jp.making.felix.db.dao.RoadDao
import jp.making.felix.androidcomponent.entity.Path
import jp.making.felix.androidcomponent.entity.Road

@Database(
    entities = [
        Road::class,
        Path::class
    ],
    version = 1
)
abstract class LocalDataBase : RoomDatabase() {
    abstract fun roadDao(): RoadDao
    abstract fun pathDao(): PathDao
}