package com.cursoandroid.julio.trocaplantao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_listagem.*
import kotlinx.android.synthetic.main.activity_tela_login.*

class Listagem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listagem)


        btn_status.setOnClickListener{

            val intent = Intent (  this,Status::class.java)
            startActivity(intent)

        }



    }
}
