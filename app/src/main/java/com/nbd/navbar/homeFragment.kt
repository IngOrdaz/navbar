package com.nbd.navbar

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.nbd.navbar.databinding.ActivityMainBinding
import com.nbd.navbar.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // iniciar binding
        //binding=FragmentHomeBinding.inflate(inflater,container, false)
        binding=FragmentHomeBinding.inflate(layoutInflater)

        //onclick pasamos a otro fragment
        val navController=findNavController()
        binding.buttonHomeToInside.setOnClickListener{
            //Toast.makeText(context, "preuba", Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            //val directions=HomeFragmentDirections.actionHomeFragmentToInsideHome()
            //navController.navigate(directions)
        }

        return binding.root
    }

}