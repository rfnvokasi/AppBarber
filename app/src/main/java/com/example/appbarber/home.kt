package com.example.appbarber

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_home.*


class home : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val context = this

        cv_cukur.setOnClickListener {
            intent = Intent(context,cukur::class.java)
            startActivity(intent)
            finish()
        }

        cv_model.setOnClickListener {
            intent = Intent(context,model::class.java)
            startActivity(intent)
            finish()
        }

        cv_layanan.setOnClickListener {
            intent = Intent(context,layanan::class.java)
            startActivity(intent)
            finish()
        }

        cv_antrian.setOnClickListener {
            intent = Intent(context,antrian::class.java)
            startActivity(intent)
            finish()
        }



        button.setOnClickListener{
            val sharedPreferences=getSharedPreferences("CEKLOGIN", Context.MODE_PRIVATE)
            val editor=sharedPreferences.edit()

            editor.putString("STATUS","0")
            editor.apply()

            startActivity(Intent(this@home,login::class.java))
            finish()
        }



    }




}
