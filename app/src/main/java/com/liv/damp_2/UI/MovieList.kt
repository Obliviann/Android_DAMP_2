package com.liv.damp_2.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.liv.damp_2.R //La R son todos mis recursos de mi proyecto (ids, layouts...) como un array gigante

class MovieList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)
    }
}
