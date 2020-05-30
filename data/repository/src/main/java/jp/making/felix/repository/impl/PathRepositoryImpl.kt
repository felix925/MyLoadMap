package jp.making.felix.repository.impl

import jp.making.felix.db.dao.PathDao
import jp.making.felix.androidcomponent.entity.Path
import jp.making.felix.repository.PathRepository
import kotlinx.coroutines.flow.Flow

class PathRepositoryImpl(
    val pathDao: PathDao
) : PathRepository {
    override fun insertPath(path: Path) =
        pathDao.insertPath(path)

    override fun updatePath(path: Path) =
        pathDao.updatePath(path)

    override fun deletePath(path: Path) =
        pathDao.deletePath(path)

    override fun getAllPath(): Flow<List<Path>> =
        pathDao.getAllPath()

    override fun getPathByParentId(roadId: Int): Flow<List<Path>> =
        pathDao.getPathByParentId(roadId)

    override fun getPathByTitle(pathTitle: String): Path? =
        pathDao.getPathByTitle(pathTitle)
}