package jp.making.felix.usecase.impl

import jp.making.felix.androidcomponent.entity.Path
import jp.making.felix.repository.PathRepository
import jp.making.felix.usecase.GetPathUseCase
import kotlinx.coroutines.flow.Flow

class GetPathUseCaseImpl(
    val pathRepository: PathRepository
) : GetPathUseCase {
    override fun getAllPath(): Flow<List<Path>> =
        pathRepository.getAllPath()

    override fun getPathByParentId(roadId: Int): Flow<List<Path>> =
        pathRepository.getPathByParentId(roadId)

    override fun getPathByTitle(roadId: String): Path? =
        pathRepository.getPathByTitle(roadId)
}