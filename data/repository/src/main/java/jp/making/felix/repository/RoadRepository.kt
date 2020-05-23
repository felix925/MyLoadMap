package jp.making.felix.repository

import jp.making.felix.androidcomponent.model.RoadItem
import jp.making.felix.db.entity.Road
import kotlinx.coroutines.flow.Flow

interface RoadRepository {
    fun insertRoad(road: Road)
    fun updateRoad(road: Road)
    fun deleteRoad(road: Road)
    fun getAllRoad() : Flow<List<RoadItem>>
    fun getRoadById(roadId: Int): RoadItem?
}