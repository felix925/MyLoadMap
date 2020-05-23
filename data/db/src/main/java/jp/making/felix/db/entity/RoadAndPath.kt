package jp.making.felix.db.entity

import androidx.room.Embedded
import androidx.room.Relation

class RoadAndPath {
    @Embedded
    lateinit var road: Road

    @Relation(parentColumn = "id", entityColumn = "parentRoad")
    lateinit var subRoads: List<Path>
}