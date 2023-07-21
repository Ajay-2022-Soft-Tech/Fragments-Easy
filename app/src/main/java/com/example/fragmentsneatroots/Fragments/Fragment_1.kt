package com.example.fragmentsneatroots.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fragmentsneatroots.R
import com.example.fragmentsneatroots.databinding.ActivityMainBinding
import com.example.fragmentsneatroots.databinding.ActivityMainBinding.inflate
import com.example.fragmentsneatroots.databinding.Fragment1Binding

class Fragment_1 : Fragment() {
    private lateinit var binding: Fragment1Binding

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= Fragment1Binding.inflate(inflater, container, false)

        var temp =5
        binding.button.setOnClickListener {
            if (temp==5){
                navController.navigate(R.id.action_fragment_1_to_settingsFragment)

            }else{

            navController.navigate(R.id.action_fragment_1_to_fragment_2)
            }
        }
        return binding.root

    }

    companion object {

    }
}