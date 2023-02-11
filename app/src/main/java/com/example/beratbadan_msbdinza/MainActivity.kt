package com.example.beratbadan_msbdinza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Tinggi : EditText
    private lateinit var rblakilaki : RadioButton
    private lateinit var rbPerempuan: RadioButton
    private lateinit var hasil : TextView
    private lateinit var jk : TextView
    private lateinit var Button: Button

    private  var tb: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tinggi = findViewById(R.id.etTb)
        rblakilaki = findViewById(R.id.rblakilaki)
        rbPerempuan = findViewById(R.id.rbPerempuan)
        jk = findViewById(R.id.tvjekel)
        hasil = findViewById(R.id.txthasil)
        Button = findViewById(R.id.button)

        Button.setOnClickListener {
            var  tinggi = Tinggi.text.toString().toInt()

            if (rblakilaki.isChecked){
                tb = (tinggi - 100) - ((tinggi - 100) * 10/100)
                hasil.setText(tb.toString()+ "Kg")
            }else{
                tb = (tinggi - 100) - ((tinggi -100)* 15/100)
                hasil.setText(tb.toString()+ "Kg")

            }

        }
    }
}