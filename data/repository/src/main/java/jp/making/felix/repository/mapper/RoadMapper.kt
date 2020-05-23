package jp.making.felix.repository.mapper

import jp.making.felix.androidcomponent.model.RoadItem
import jp.making.felix.db.entity.Road

fun Road.toRoadItem() = RoadItem(
    id = this.id,
    title = this.title,
    completePer = 0
)