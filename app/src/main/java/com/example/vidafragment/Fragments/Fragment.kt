package com.example.vidafragment.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vidafragment.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {   //Crea el Fragmento
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.e("ciclo", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,              //Crea la vista del fragmento
        savedInstanceState: Bundle?
    ): View? {
        Log.e("ciclo", "onCreateView")
        return inflater.inflate(R.layout.fragment_, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {          //Crea la logica del fragmento
        super.onActivityCreated(savedInstanceState)
        Log.e("ciclo", "onActivityCreated")
    }

    override fun onStart() {         //inicia el fragmento
        super.onStart()
        Log.e("ciclo", "onStart")

    }

    override fun onResume() {      //obtiene resumen del fragmento
        super.onResume()
        Log.e("ciclo", "onResume")

    }


    override fun onPause() {      //Pausa el fragmento
        super.onPause()
        Log.e("ciclo", "onPause")

    }

    override fun onDestroyView() {       //Destruye la vista del fragmento
        super.onDestroyView()
        Log.e("ciclo", "onDestroyView")
    }

    override fun onDetach() {
        Log.e("ciclo", "Desanclado F1")

        super.onDetach()
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}