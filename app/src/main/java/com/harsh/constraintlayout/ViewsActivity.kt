package com.harsh.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ViewsActivity : AppCompatActivity() {
    var radioGroupGender: RadioGroup? = null
    var seekbar :SeekBar? = null
    var pbar :ProgressBar? = null
    var ageText : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views)

        radioGroupGender = findViewById(R.id.radiogroup_gender)
        seekbar = findViewById(R.id.seekbar)
        pbar = findViewById(R.id.progress_bar)
        ageText = findViewById(R.id.selectAgeText)
        radioGroupGender?.setOnCheckedChangeListener { radioGroup, checkedId ->

            val radioButton: RadioButton = radioGroup.findViewById(checkedId)
            val selectedGender = radioButton.text.toString()
            pbar?.visibility = View.GONE
            Toast.makeText(this, "Selected Gender:" + selectedGender, Toast.LENGTH_SHORT).show()
        }
        seekbar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    Toast.makeText(this@ViewsActivity,
                        "Progress is: " + p0.progress + "%",
                        Toast.LENGTH_SHORT).show()
                }
            }

        })


    }
}