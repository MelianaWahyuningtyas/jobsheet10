package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var kelas : EditText
    private lateinit var nis : EditText
    private lateinit var submit : Button

    private val NAME_KEY: String = "nama"
    private val CLASS_KEY: String = "kelas"
    private val NIS_KEY: String = "nis"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.nama)
        kelas = findViewById(R.id.kelas)
        nis = findViewById(R.id.nis)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener{
            val intent =Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY   , nama.text.toString())
            intent.putExtra(CLASS_KEY,kelas.text.toString())
            intent.putExtra(NIS_KEY, nis.text.toString())
            startActivity(intent)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        }
    }


}