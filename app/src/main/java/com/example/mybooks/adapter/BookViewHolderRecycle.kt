package com.example.mybooks.adapter

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooks.R

class BookViewHolderRecycle(v: View) : RecyclerView.ViewHolder(v) {

    val textViewTitle: TextView
    //Fazer depois - Em outro listar || val textViewAutor: TextView
    //Fazer depois - Em outro listar ||val textViewScore: TextView
    //Fazer depois - Quando mudar o Model || val img: ImageView

    init {
        Log.i("HOLDER", "Fazendo buscas por id...")
        textViewTitle = v.findViewById(R.id.nameTitle)
        //Fazer depois - Em outro listar ||textViewAutor = v.findViewById(R.id.)
        //Fazer depois - Em outro listar ||textViewScore = v.findViewById(R.id.quantidade)
        //Fazer depois - Quando mudar o Model || val img: ImageViewimg = v.findViewById(R.id.img)
    }
}