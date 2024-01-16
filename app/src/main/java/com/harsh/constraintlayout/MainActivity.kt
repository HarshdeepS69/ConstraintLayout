package com.harsh.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Switch

var switch1 :Switch? = null
var viewbox : View? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1= findViewById(R.id.switch1)
        viewbox = findViewById(R.id.viewCenter)

        switch1?.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked){
                viewbox?.visibility = View.VISIBLE
            }
            else{
                viewbox?.visibility = View.GONE
            }


        }
    }
}