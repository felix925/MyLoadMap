package jp.making.felix.repository.impl

import jp.making.felix.repository.PathRepository
import kotlinx.coroutines.flow.Flow
import java.nio.file.Path

class PathRepositoryImpl(
    private val pathRepository: PathRepository
): PathRepository {
    override fun insertPath(path: Path) =
        pathRepository.insertPath(path)

    override fun updatePath(path: Path) =
        pathRepository.updatePath(path)

    override fun deletePath(path: Path) =
        pathRepository.deletePath(path)

    override fun getAllPath(): Flow<List<Path>> =
        pathRepository.getAllPath()

    override fun getPathByParentId(roadId: Int): Flow<List<Path>> =
        pathRepository.getPathByParentId(roadId)

    override fun getPathByTitle(pathTitle: String): Path =
        pathRepository.getPathByTitle(pathTitle)
}