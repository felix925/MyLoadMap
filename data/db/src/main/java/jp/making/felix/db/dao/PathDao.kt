package jp.making.felix.db.dao

import androidx.room.*
import jp.making.felix.androidcomponent.entity.Path
import kotlinx.coroutines.flow.Flow

@Dao
interface PathDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPath(vararg path: Path)

    @Update
    fun updatePath(vararg path: Path)

    @Delete
    fun deletePath(vararg path: Path)

    @Query("SELECT * FROM path WHERE path_title = :pathTitle LIMIT 1")
    fun getPathByTitle(pathTitle: String): Path?

    @Query("SELECT * FROM path")
    fun getAllPath(): Flow<List<Path>>

    @Query("SELECT * FROM path WHERE parentRoad = :subPathId")
    fun getPathByParentId(subPathId: Int): Flow<List<Path>>
}