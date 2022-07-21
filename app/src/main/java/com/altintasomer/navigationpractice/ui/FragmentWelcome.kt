package com.altintasomer.navigationpractice.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.altintasomer.navigationpractice.R
import com.altintasomer.navigationpractice.databinding.FragmentWelcomeBinding

class FragmentWelcome : Fragment(R.layout.fragment_welcome) {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWelcomeBinding.bind(view)

        val username = arguments?.getString("username")
        val password = arguments?.getString("password")

        binding.tvUsername.text = username
        binding.tvPassword.text = password
        binding.btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentWelcome_to_homeFragment)
        }
    }
}