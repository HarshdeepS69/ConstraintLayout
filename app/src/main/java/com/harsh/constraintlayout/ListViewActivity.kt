package com.harsh.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    var listV : ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        var cityNames = arrayOf("Rahon","Nawanshahr","Banga","Phagwara")
        listV = findViewById(R.id.lv)
        val arrayAdapter :ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,cityNames)
        listV?.adapter = arrayAdapter
        listV?.setOnItemClickListener{adapterView,view,i,l ->
            Toast.makeText(this,"Item Selected :${cityNames[i]}",Toast.LENGTH_LONG).show()
        }
    }
}