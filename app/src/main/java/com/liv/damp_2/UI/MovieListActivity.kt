package com.liv.damp_2.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.liv.damp_2.R //La R son todos los recursos de mi proyecto (ids, layouts...) como un array gigante

class MovieListActivity : AppCompatActivity() { //why 'AppCompat...'  ???
    //Once we've added a RecyclerView widget to our layout file, we:
    //1.obtain a handle to the object
    private lateinit var recyclerView: RecyclerView
    //2.connect it to a LayoutManager - provides the views to the object
    private lateinit var viewManager: RecyclerView.LayoutManager
    //3.attach an adapter - binds the items/ViewHolder objs to their data, creates views
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)
                      //new LLM object
        viewManager = LinearLayoutManager(this)
        viewAdapter = MovieAdapter(movieDataset)                     //TODO: movieDataset???

                                    /*<casting>*/
        recyclerView = findViewById<RecyclerView>(R.id.movie_recycler_view).apply {
            //setting to improve performance (use only if changes in content dont change layout size of the RV)
            //setHasFixedSize(true)

            //setLayoutManager to LinearLayoutManager
            layoutManager = viewManager

            //setAdapter to MovieAdapter
            adapter = viewAdapter
        }
    }
}
