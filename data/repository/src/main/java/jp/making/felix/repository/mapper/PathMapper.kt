package jp.making.felix.repository.mapper

import jp.making.felix.androidcomponent.model.PathItem
import jp.making.felix.db.entity.Path

fun Path.toPathItem() = PathItem(
    id = this.id,
    title = this.title,
    isDone = this.isCompleted
)