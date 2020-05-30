package jp.making.felix.usecase

import jp.making.felix.androidcomponent.entity.Road
import jp.making.felix.androidcomponent.model.RoadItem
import kotlinx.coroutines.flow.Flow

interface GetRoadUseCase {
    fun getAllRoad(): Flow<List<Road>>
    fun getRoadById(roadId: Int): Road?
}