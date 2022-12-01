package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class PowerFrag : Fragment(R.layout.fragment_power) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val voltageP: EditText = view.findViewById(R.id.voltage)
        val currentP: EditText = view.findViewById(R.id.current)
        val button: Button = view.findViewById(R.id.powerB)
        val pRes: TextView = view.findViewById(R.id.powerResult)

        button.setOnClickListener{
            var v = voltageP.text.toString().toInt()
            var i = currentP.text.toString().toInt()
            var p = v*i
            pRes.text = p.toString()
        }
    }
}
