package com.example.carnitas_milos_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.carnitas_milos_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        /*
        OBSOLETO
            val textoPantalla = findViewById<TextView>(R.id.txtHello)
            textoPantalla.text = "Buenos Días!"
            val textoPrueba = findViewById<TextView>(R.id.txtOperador)
        NUEVO
            binding.textoPantalla.text = "Buenos Días!"
        */



        val spinner = findViewById<Spinner>(R.id.spinner)
        val users = listOf("LuisFlahan", "Anna", "Kriss", "Dany")

        val adaptador = ArrayAdapter(this, R.layout.custom_item_spinner,users)
        spinner.adapter = adaptador
        spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                //textoPrueba.text = users[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}