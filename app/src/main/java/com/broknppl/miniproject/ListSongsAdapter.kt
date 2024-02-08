package com.broknppl.miniproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListSongsAdapter (private val listsong : ArrayList<Songs>): RecyclerView.Adapter<ListSongsAdapter.MyViewHolder>() {

    var onItemClick : ((Songs) -> Unit)? = null

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imagesongs : ImageView = itemView.findViewById(R.id.albumImage)
        val namesongs : TextView = itemView.findViewById(R.id.nameSongs)
        val descriptionsongs : TextView = itemView.findViewById(R.id.descSongs)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSongsAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_songs_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listsong.size
    }

    override fun onBindViewHolder(holder: ListSongsAdapter.MyViewHolder, position: Int) {
        holder.namesongs.text = listsong[position].name
        holder.descriptionsongs.text = listsong[position].description

        Glide.with(holder.itemView.context)
            .load(listsong[position].image)
            .into(holder.imagesongs)


        val mContext = holder.itemView.context
    }
}