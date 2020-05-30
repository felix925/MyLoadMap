package jp.making.felix.repository.impl

import jp.making.felix.db.dao.RoadDao
import jp.making.felix.androidcomponent.entity.Road
import jp.making.felix.repository.RoadRepository
import kotlinx.coroutines.flow.Flow

class RoadRepositoryImpl(
    val roadDao: RoadDao
) : RoadRepository {
    override fun insertRoad(road: Road) =
        roadDao.insertRoad(road)

    override fun updateRoad(road: Road) =
        roadDao.updateRoad(road)

    override fun deleteRoad(road: Road) =
        roadDao.deleteRoad(road)

    // TODO UseCaseで変換したかったけど、Entityを他のクラスに見せたくないからRepositoryで変換した...
    override fun getAllRoad(): Flow<List<Road>> =
        roadDao.getAllRoad()

    override fun getRoadById(roadId: Int): Road? =
        roadDao.getRoadById(roadId)

}