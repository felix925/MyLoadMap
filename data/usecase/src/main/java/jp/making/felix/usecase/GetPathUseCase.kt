package jp.making.felix.usecase

import jp.making.felix.androidcomponent.entity.Path
import kotlinx.coroutines.flow.Flow

interface GetPathUseCase {
    fun getAllPath(): Flow<List<Path>>
    fun getPathByParentId(roadId: Int): Flow<List<Path>>
    fun getPathByTitle(roadId: String): Path?
}