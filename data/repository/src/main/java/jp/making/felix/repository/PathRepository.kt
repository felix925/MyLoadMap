package jp.making.felix.repository

import java.nio.file.Path
import kotlinx.coroutines.flow.Flow

interface PathRepository {
    fun insertPath(path: Path)
    fun updatePath(path: Path)
    fun deletePath(path: Path)
    fun getPathByTitle(pathTitle: String): Path
    fun getAllPath() : Flow<List<Path>>
    fun getPathByParentId(roadId: Int): Flow<List<Path>>
}