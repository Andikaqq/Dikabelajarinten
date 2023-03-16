package com.example.dikabelajarinten

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent -> run {
                val intentBiasa = Intent(this@MainActivity,PindahActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intenntData = Intent(this@MainActivity,PindahDataActivity::class.java)
                intenntData.putExtra(PindahDataActivity.EXTRA_TEXT,"hallo,ayo belajar kotlin")
                startActivity(intenntData)

            }
            R.id.btn_pindah_objek -> run{
                val cars = Cars(
                    "Toyota yaris",
                    2020,
                    "BM 1910 DIK"
                )
                val intentObjek = Intent(this@MainActivity,PindahObjekActivity::class.java)
                intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS,cars)
                startActivity(intentObjek)
            }
        }
    }
}