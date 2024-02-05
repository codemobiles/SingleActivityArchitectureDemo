package com.codemobiles.android.singleactivity.demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codemobiles.android.singleactivity.demo.R
import com.codemobiles.android.singleactivity.demo.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        setEvents()
        return binding.root
    }

    private fun setEvents() {
        binding.goBtn.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAnotherFragment("I am Lek CodeMobiles."))
        }
    }
}