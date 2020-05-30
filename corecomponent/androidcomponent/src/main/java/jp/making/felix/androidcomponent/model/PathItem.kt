package jp.making.felix.androidcomponent.model

data class PathItem(
    val parentId: Int,
    val id: Int,
    val title: String,
    var isDone: Boolean
)