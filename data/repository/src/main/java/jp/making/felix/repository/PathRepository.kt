package jp.making.felix.repository

import jp.making.felix.androidcomponent.model.PathItem
import jp.making.felix.db.entity.Path
import kotlinx.coroutines.flow.Flow

interface PathRepository {
    fun insertPath(path: Path)
    fun updatePath(path: Path)
    fun deletePath(path: Path)
    fun getPathByTitle(pathTitle: String): PathItem?
    fun getAllPath() : Flow<List<PathItem>>
    fun getPathByParentId(roadId: Int): Flow<List<PathItem>>
}