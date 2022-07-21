package com.altintasomer.navigationpractice.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.altintasomer.navigationpractice.R
import com.altintasomer.navigationpractice.databinding.FragmentLoginBinding

class FragmentLogin: Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.btnConfirm.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            if (username.isEmpty() && password.isEmpty()){
                Toast.makeText(requireContext(),"Username and password is must",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val data = bundleOf(
                "username" to username,
                "password" to password
            )
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentWelcome,data)

        }
    }
}