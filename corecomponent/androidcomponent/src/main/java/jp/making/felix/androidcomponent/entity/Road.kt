package jp.making.felix.androidcomponent.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "road")
data class Road(
    @ColumnInfo(name = "road_title")
    val title: String = "",
    @ColumnInfo(name = "road_desc")
    val desc: String = ""
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int  = 0
}