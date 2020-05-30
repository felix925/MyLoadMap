package jp.making.felix.home.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import bindData
import jp.making.felix.home.HomeController
import jp.making.felix.home.R
import jp.making.felix.home.databinding.FragmentHomeBinding
import jp.making.felix.home.viewModel.HomeViewModel
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    val viewModel: HomeViewModel by viewModel()
    private lateinit var controller: HomeController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        controller = HomeController()
        binding = FragmentHomeBinding.bind(view)
        binding.lifecycleOwner = this

        viewModel.showLog()

//        bindData(viewModel.item) {
//            binding.recyclerView.setController(controller)
//        }
    }
}