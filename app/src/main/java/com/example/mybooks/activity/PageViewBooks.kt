package com.example.mybooks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import androidx.viewpager.widget.ViewPager
import com.example.mybooks.R
import com.example.mybooks.adapter.PageAdapterBook
import com.example.mybooks.database.AppDatabase
import kotlinx.android.synthetic.main.activity_page_view_books.*


class PageViewBooks : AppCompatActivity() {

    val db: AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "bookdb.sqlite")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_view_books)

        viewpage.adapter = PageAdapterBook(this, db.bookDao().listAll()  )
        viewpage.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(state: Int) {
                Log.i("AULA17", "onPageScrollStateChanged");
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                Log.i("AULA17", "onPageScrolled chamado, posição: "+position);
            }

            override fun onPageSelected(position: Int) {
                Log.i("AULA17", "onPageSelected chamado, posição: "+position);
            }

        })

    }
}
