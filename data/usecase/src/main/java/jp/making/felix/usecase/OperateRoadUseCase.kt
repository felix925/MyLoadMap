package jp.making.felix.usecase

import jp.making.felix.androidcomponent.entity.Road

interface OperateRoadUseCase {
    fun insertRoad(road: Road)
    fun deleteRoad(road: Road)
}