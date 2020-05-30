package jp.making.felix.usecase.impl

import jp.making.felix.androidcomponent.entity.Road
import jp.making.felix.repository.RoadRepository
import jp.making.felix.usecase.GetRoadUseCase
import kotlinx.coroutines.flow.Flow

class GetRoadUseCaseImpl(
    val repository: RoadRepository
) : GetRoadUseCase {
    override fun getAllRoad(): Flow<List<Road>> =
        repository.getAllRoad()

    override fun getRoadById(roadId: Int): Road? =
        repository.getRoadById(roadId)
}