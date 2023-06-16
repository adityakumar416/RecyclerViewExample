package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CustomAdapter(private val mList: ArrayList<Name>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){



    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: CircleImageView = itemView.findViewById(R.id.circleImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.name_textView)
        val ageTextView: TextView = itemView.findViewById(R.id.textView_age)

    }



    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val Name = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(Name.image)

        // sets the text to the textview from our itemHolder class
        holder.nameTextView.text = Name.text
        holder.ageTextView.text = Name.age.toString()
    }

    // return the number of the items in the list

    // override fun getItemCount() = mList.size

    override fun getItemCount(): Int {
        return mList.size
    }


}