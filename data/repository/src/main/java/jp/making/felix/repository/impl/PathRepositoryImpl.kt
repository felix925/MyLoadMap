package jp.making.felix.repository.impl

import jp.making.felix.androidcomponent.model.PathItem
import jp.making.felix.db.dao.PathDao
import jp.making.felix.db.entity.Path
import jp.making.felix.repository.PathRepository
import jp.making.felix.repository.mapper.toPathItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@ExperimentalStdlibApi
class pathRepositoryImpl(
    private val pathDao: PathDao
) : PathRepository {
    override fun insertPath(path: Path) =
        pathDao.insertPath(path)

    override fun updatePath(path: Path) =
        pathDao.updatePath(path)

    override fun deletePath(path: Path) =
        pathDao.deletePath(path)

    override fun getAllPath(): Flow<List<PathItem>> =
        pathDao.getAllPath().map { it ->
            buildList {
                it.forEach {
                    this.add(it.toPathItem())
                }
            }
        }

    override fun getPathByParentId(roadId: Int): Flow<List<PathItem>> =
        pathDao.getPathByParentId(roadId).map { it ->
            buildList {
                it.forEach {
                    this.add(it.toPathItem())
                }
            }
        }

    override fun getPathByTitle(pathTitle: String): PathItem? =
        pathDao.getPathByTitle(pathTitle)?.toPathItem()
}