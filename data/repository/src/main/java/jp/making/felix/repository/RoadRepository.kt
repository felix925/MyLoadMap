package jp.making.felix.repository

import jp.making.felix.db.entity.Road
import kotlinx.coroutines.flow.Flow

interface RoadRepository {
    fun insertRoad(road: Road)
    fun updateRoad(road: Road)
    fun deleteRoad(road: Road)
    fun getAllRoad() : Flow<List<Road>>
    fun getRoadById(roadId: Int): Road?
}