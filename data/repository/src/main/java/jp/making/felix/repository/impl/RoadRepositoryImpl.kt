package jp.making.felix.repository.impl

import jp.making.felix.androidcomponent.model.RoadItem
import jp.making.felix.db.dao.RoadDao
import jp.making.felix.db.entity.Road
import jp.making.felix.repository.RoadRepository
import jp.making.felix.repository.mapper.toRoadItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@ExperimentalStdlibApi
class RoadRepositoryImpl(
    private val roadDao: RoadDao
) : RoadRepository {
    override fun insertRoad(road: Road) =
        roadDao.insertRoad(road)

    override fun updateRoad(road: Road) =
        roadDao.updateRoad(road)

    override fun deleteRoad(road: Road) =
        roadDao.deleteRoad(road)

    // TODO UseCaseで変換したかったけど、Entityを他のクラスに見せたくないからRepositoryで変換した...
    override fun getAllRoad(): Flow<List<RoadItem>> =
        roadDao.getAllRoad().map {
            buildList {
                it.forEach {
                    this.add(it.toRoadItem())
                }
            }
        }

    override fun getRoadById(roadId: Int): RoadItem? =
        roadDao.getRoadById(roadId)?.toRoadItem()

}