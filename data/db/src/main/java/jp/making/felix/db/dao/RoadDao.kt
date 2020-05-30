package jp.making.felix.db.dao

import androidx.room.*
import jp.making.felix.androidcomponent.entity.Road
import kotlinx.coroutines.flow.Flow

@Dao
interface RoadDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertRoad(vararg road: Road)

    @Update
    fun updateRoad(vararg road: Road)

    @Delete
    fun deleteRoad(vararg road: Road)

    @Query("DELETE FROM road")
    fun deleteAllRoad()

    @Query("SELECT * FROM road")
    fun getAllRoad(): Flow<List<Road>>

    @Query("SELECT * FROM road WHERE id = :roadId LIMIT 1")
    fun getRoadById(roadId: Int): Road?
}