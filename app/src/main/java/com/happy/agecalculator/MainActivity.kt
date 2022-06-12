package com.happy.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // when you click on get my age, this function is executed
    fun BUClickevent(view: View){
        val DOB =findViewById<EditText>(R.id.etDOB)
        val SHOWAGE = findViewById<TextView>(R.id.tvshowage)
        val userDOB:String=DOB.text.toString()
        //when the date of birth is wrong
        if(userDOB.toInt() == 0){
            SHOWAGE.text = "invalid input"
            return
        }
        //getting the year from the calendar
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)

        //getting the age
        val myAge = year - userDOB.toInt()

        //displaying the age
        SHOWAGE.text = "Your age is $myAge"
    }
}