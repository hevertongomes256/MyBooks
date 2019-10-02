package com.example.mybooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.*
import kotlinx.android.synthetic.main.activity_add_book.*

class AddBook : AppCompatActivity() {

    val db:AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "database-books")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)

        buttonSalvar.setOnClickListener {
            db.bookDao().inserir(Book(textTitle.text.toString(), textAutor.text.toString(),textAno.text.toString().toInt(),ratingBarBota.height.toFloat()))
            Log.i("Add","Adicionou um livro")
        }
    }
}