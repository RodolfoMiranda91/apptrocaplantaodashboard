package com.cursoandroid.julio.trocaplantao

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tela_login.*
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_tela_login.*
import kotlinx.android.synthetic.main.activity_listagem.*
import kotlinx.android.synthetic.main.activity_status.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class telaLOGIN : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        // btn_entrar.setOnClickListener{
        //   if(usuario.text.toString() .equals("julio")
        //    && senha.text.toString() .equals("patota")){
        //        val intent = Intent (  this,Listagem::class.java)
        //        startActivity(intent)
        //    } else
        //       "Erro"
        //}

    }
}
