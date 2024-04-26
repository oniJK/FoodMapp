package com.example.foodmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.foodmap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeFragment(HomeFragment())
//смена фрагментов
        binding.bottomNavView.setOnItemSelectedListener {
            when (it.itemId){
                R.id.home ->{
                    changeFragment(HomeFragment())
                }
                R.id.favorite ->{
                    changeFragment(FavoriteFragment())
                }
                R.id.search ->{
                    changeFragment(SearchFragment())
                }
                R.id.history ->{
                    changeFragment(HistoryFragment())
                }
                R.id.profile ->{
                    changeFragment(ProfileFragment())
                }
            }
            return@setOnItemSelectedListener true
        }
    }

    //изменение фрагментов от bottomnav
    fun changeFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
