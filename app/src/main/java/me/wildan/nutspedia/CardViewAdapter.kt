package me.wildan.nutspedia

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(private val listNuts: ArrayList<Nuts>) : RecyclerView.Adapter<CardViewAdapter.CardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewAdapter.CardViewHolder {
        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_nuts, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val nuts = listNuts[position]

        Glide.with(holder.itemView.context)
            .load(nuts.photo)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)

        holder.tvName.text = nuts.name
        holder.tvDesc.text = nuts.desc
    }

    override fun getItemCount(): Int {
        return listNuts.size
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_detail)
    }
}