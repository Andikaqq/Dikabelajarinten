package com.example.dikabelajarinten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {
    companion object{
        const val  EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvpenerima : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvpenerima =findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text Yang Dikirim : $tvReceived"

        tvpenerima.text = text
    }
}