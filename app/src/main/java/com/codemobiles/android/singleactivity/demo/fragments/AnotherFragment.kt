package com.codemobiles.android.singleactivity.demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codemobiles.android.singleactivity.demo.R
import com.codemobiles.android.singleactivity.demo.databinding.FragmentAnotherBinding
import com.codemobiles.android.singleactivity.demo.databinding.FragmentMainBinding
import androidx.navigation.fragment.navArgs


class AnotherFragment : Fragment(R.layout.fragment_another) {

    private val args by navArgs<AnotherFragmentArgs>()
    private lateinit var binding: FragmentAnotherBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnotherBinding.inflate(layoutInflater)
        binding.messageTextView.text = args.message
        setEvents()
        return binding.root
    }

    private fun setEvents() {
        binding.backBtn.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}