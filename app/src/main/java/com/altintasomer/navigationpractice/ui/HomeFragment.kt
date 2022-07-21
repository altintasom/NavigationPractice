package com.altintasomer.navigationpractice.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.altintasomer.navigationpractice.R
import com.altintasomer.navigationpractice.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding:  FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fragmentLogin)
        }
    }
}

