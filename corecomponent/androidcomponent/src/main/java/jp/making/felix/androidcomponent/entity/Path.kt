package jp.making.felix.androidcomponent.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "path",
    foreignKeys = arrayOf(
        ForeignKey(
            entity = Road::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("parentRoad"),
            onDelete = ForeignKey.CASCADE
        )
    )
)
data class Path(
    val parentRoad: Int = 0,
    @ColumnInfo(name = "path_title")
    val title: String = "",
    @ColumnInfo(name = "is_completed")
    val isCompleted: Boolean = false
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}