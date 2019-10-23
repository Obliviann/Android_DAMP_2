package com.liv.damp_2.UI

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import com.liv.damp_2.R

//ADAPTER: created by extending RecyclerView.Adapter object
//1. binds a VIEW to a DATA ITEM
//1.2 (a complex data item may need more than one view, you provide access to all the views for a data item in a VIEW HOLDER)
//2. creates VIEWHOLDERS objs (views) (layoutMan provides them to the obj)

//TODO:MovieItem
class MovieAdapter (private val movieDataset: Array<String>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    //1. We provide a reference to the VIEWS for each DATA ITEM
    // Each data item is a String that is shown in a TextView??? TODO: String -> MovieItem?
                                                                //TODO: create (TeaxtView) widget
    class MovieViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    //2. create a new VH (method invoked by the LayoutMan)             2.1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item_view, parent, false) as TextView//2.2
        //2.3 TODO: set the view's size, margins, paddings and layout parameters

        return MovieViewHolder(textView)
        //2.1 method needs to construct a RecyclerView.ViewHolder, whose type must match the type declared in the Adapter class signature
        //2.2 it sets the view's contents by inflating an xml layout file TODO:create layout file
        //2.3 me must assign these contents/data
    }

    //3. bind the VH to it's data/replace the contents of a V (method invoked by the LayoutMan)
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        // -TODO: get element from movieDataset at this position
        // -TODO: replace the contents of the view with that element
        holder.textView.text = movieDataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = movieDataset.size
}

