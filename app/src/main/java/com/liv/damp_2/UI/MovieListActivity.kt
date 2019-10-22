package com.liv.damp_2.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.liv.damp_2.R //La R son todos los recursos de mi proyecto (ids, layouts...) como un array gigante

class MovieListActivity : AppCompatActivity() {
    //Once we've added a RecyclerView widget to our layout file, we:
    //1.obtain a handle to the object
                        //var name      //type
    private lateinit var recyclerView: RecyclerView
    //2.connect it to a LayoutManager - provides the views to the object
    private lateinit var viewManager: RecyclerView.LayoutManager
    /*3.attach an adapter -creates views for the data (items/ViewHolder objs) to be displayed
                          -binds the VH to their data*/
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)
                        // new LLM object
        viewManager = LinearLayoutManager(this)
        //viewAdapter = MovieAdapter(myDataset)                          //???
                                    //casting
        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            //setting to improve performance (use only if changes in content dont change layout size of the RV)
            //setHasFixedSize(true)

            //setLayoutManager to LinearLayouManager
            layoutManager = viewManager

            //setAdapter to MyAdapter
            adapter = viewAdapter
        }
    }
}
