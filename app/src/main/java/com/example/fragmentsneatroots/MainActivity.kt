package com.example.fragmentsneatroots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentsneatroots.Fragments.Fragment_1
import com.example.fragmentsneatroots.Fragments.Fragment_2
import com.example.fragmentsneatroots.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//
////        replaceFrameWithFragment(Fragment_1())
//
//        binding.button1.setOnClickListener {
//
//            replaceFrameWithFragment(Fragment_1())
//
//        }
//
//        binding.button2.setOnClickListener{
//            replaceFrameWithFragment(Fragment_2())
//
//        }
//
//
//
//    }
//
//    fun replaceFrameWithFragment (Frag: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame, Frag)
//        fragmentTransaction.commit()
    }
}