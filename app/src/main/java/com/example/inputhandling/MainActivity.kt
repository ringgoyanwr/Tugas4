package com.example.inputhandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.namaField)
        val buttonAdd = findViewById<ImageButton>(R.id.imgButtonAdd)
        val buttonRemove = findViewById<ImageButton>(R.id.imgButtonCancel)
        buttonRemove.setOnClickListener {
            name.text = null
            radioGroup.clearCheck()
            berenangCheckbox!!.isChecked=false
            bermusikCheckbox!!.isChecked=false
            bernyanyiCheckbox!!.isChecked=false

        }
        buttonAdd.setOnClickListener {
            var id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) {
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext, "${name.text}, gender: ${radio.text} telah berhasil disimpan", Toast.LENGTH_LONG).show()
            }
        }
        printHobby()
    }

    private fun printHobby() {
        val codingCb = findViewById<CheckBox>(R.id.berenangCheckbox)
        val singingCb = findViewById<CheckBox>(R.id.bernyanyiCheckbox)
        val dancingCb = findViewById<CheckBox>(R.id.bermusikCheckbox)

        codingCb.setOnClickListener {
            if (codingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${codingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${codingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
        singingCb.setOnClickListener {
            if (singingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${singingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${singingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
        dancingCb.setOnClickListener {
            if (dancingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${dancingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${dancingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
