package com.example.assigment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class DollarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dollar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val bt: Button = view.findViewById(R.id.enterBtDollar)
        val res: TextView = view.findViewById(R.id.resultDollar)
        val input: EditText = view.findViewById(R.id.jodAmountToDollar)
        bt.setOnClickListener(){
            var entry = input.text.toString().toFloat()
            res.text = (entry*1.41).toString()
        }
    }
}
