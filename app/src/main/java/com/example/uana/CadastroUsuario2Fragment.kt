package com.example.uana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uana.databinding.FragmentCadastroUsuario2Binding


class CadastroUsuario2Fragment : Fragment() {

    private lateinit var binding: FragmentCadastroUsuario2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    binding = FragmentCadastroUsuario2Binding.inflate(layoutInflater, container, false)


    binding.buttonNext.setOnClickListener {
        findNavController().navigate(R.id.action_cadastroUsuario2Fragment_to_homeFragment)
    }

    binding.buttonVoltar.setOnClickListener {
        findNavController().navigate(R.id.action_cadastroUsuario2Fragment_to_cadastroUsuarioFragment)
    }

    return binding.root
            }
    }
