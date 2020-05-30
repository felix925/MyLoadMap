package jp.making.felix.home.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import jp.making.felix.usecase.GetRoadUseCase

class HomeViewModel(
    val getRoadUseCase: GetRoadUseCase
//    val operateRoadUseCase: OperateRoadUseCase
) : ViewModel() {
    //    val item = getRoadUseCase.getAllRoad()
    fun showLog() {
        Log.d("test", "hoge")
    }
}