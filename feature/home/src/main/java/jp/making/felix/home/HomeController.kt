package jp.making.felix.home

import com.airbnb.epoxy.TypedEpoxyController
import jp.making.felix.androidcomponent.entity.Road
import jp.making.felix.androidcomponent.road

class HomeController : TypedEpoxyController<List<Road>>() {
    override fun buildModels(data: List<Road>?) {
        requireNotNull(data)
        data.forEach {
            road {
                id(it.id)
                title(it.title)
            }
        }
    }
}