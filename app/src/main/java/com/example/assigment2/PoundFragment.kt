package com.example.assigment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class PoundFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pound, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bt: Button = view.findViewById(R.id.enterBtPound)
        val res: TextView = view.findViewById(R.id.resultPound)
        val input: EditText = view.findViewById(R.id.jodAmountToPound)
        bt.setOnClickListener(){
            var entry = input.text.toString().toFloat()
            res.text = (entry*1.10).toString()
        }
    }
}