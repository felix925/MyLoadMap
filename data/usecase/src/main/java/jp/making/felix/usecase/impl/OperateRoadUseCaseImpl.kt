package jp.making.felix.usecase.impl

import jp.making.felix.androidcomponent.entity.Road
import jp.making.felix.repository.RoadRepository
import jp.making.felix.usecase.OperateRoadUseCase

class OperateRoadUseCaseImpl(
    val repository: RoadRepository
) : OperateRoadUseCase {

    override fun insertRoad(road: Road) {
        if (repository.getRoadById(road.id) == null) {
            repository.insertRoad(road)
        } else {
            repository.updateRoad(road)
        }
    }

    override fun deleteRoad(road: Road) {
        repository.deleteRoad(road)
    }
}