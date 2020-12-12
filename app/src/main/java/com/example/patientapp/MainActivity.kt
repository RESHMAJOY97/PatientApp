package com.example.patientapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funcionsubmit(view: View) {
        var getname=findViewById<EditText>(R.id.name)
        var getdoctor=findViewById<EditText>(R.id.doctor)
        var getsymptoms=findViewById<EditText>(R.id.symptoms)
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getdoctor.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getsymptoms.text.toString(),Toast.LENGTH_LONG).show()
        }
}