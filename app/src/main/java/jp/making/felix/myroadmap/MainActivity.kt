package jp.making.felix.myroadmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.databinding.DataBindingUtil
import jp.making.felix.myroadmap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> navController.navigate(R.id.fragmentHome)
            }
            true
        }
    }
}