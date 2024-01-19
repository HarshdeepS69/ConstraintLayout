package com.harsh.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class SnackBarActivity : AppCompatActivity() {
    var btnToast : Button? = null
    var btnSnackBar : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
        btnToast = findViewById(R.id.btnToast)
        btnSnackBar = findViewById(R.id.btnSnackBar)

        btnToast?.setOnClickListener(){
            Toast.makeText(applicationContext,"Toast Button Clicked",Toast.LENGTH_LONG).show()
        }
        btnSnackBar?.setOnClickListener(){
            Snackbar.make(it,"SnackBar Button Clicked",
                Snackbar.LENGTH_INDEFINITE).setAction("close",  {_ ->
                   Toast.makeText(this,"SnackBar Closed",Toast.LENGTH_SHORT).show()
            }).show()
        }
    }
}