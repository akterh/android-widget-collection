package com.bitamirshafiee.widgetpracticeskeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekbar :SeekBar= findViewById(R.id.seekBar)
        val ageText : TextView = findViewById(R.id.seekText)
        val spinner : Spinner = findViewById(R.id.spinner)
        ageText.text = String.format(resources.getString(R.string.str_age_tools),0)
        seekbar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener

        {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                ageText.text = String.format(resources.getString(R.string.str_age_tools),p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        }
        )

//        val arrayAdapter = ArrayAdapter.createFromResource(
//            this,R.array.list_of_units,android.
//        R.layout.simple_list_item_1             //this is regular expression
//
//        )
//        spinner.adapter = arrayAdapter
         ArrayAdapter.createFromResource(
            this,R.array.list_of_units,android.
            R.layout.simple_list_item_1          //using also function

        ).also { arrayAdapter->
             spinner.adapter = arrayAdapter
         }

    }
}