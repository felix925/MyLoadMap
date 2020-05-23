package jp.making.felix.usecase

import jp.making.felix.androidcomponent.model.RoadItem
import kotlinx.coroutines.flow.Flow

interface GetRoadUseCase {
    val roadList: Flow<List<RoadItem>>
}