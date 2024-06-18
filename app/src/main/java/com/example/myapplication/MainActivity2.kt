package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var nama: TextView
    private lateinit var kelas: TextView
    private lateinit var nis: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        nama = findViewById(R.id.namaV)
        kelas = findViewById(R.id.kelasView)
        nis = findViewById(R.id.nisView)

        val extras = intent.extras

        nama.text = extras?.getString("nama")
        kelas.text = extras?.getString("kelas")
        nis.text= extras?.getString("nis")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }


    }
}