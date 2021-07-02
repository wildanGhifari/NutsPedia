package me.wildan.nutspedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListViewAdapter(private val listNuts: ArrayList<Nuts>) : RecyclerView.Adapter<ListViewAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback : OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(item : Nuts)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnShare: Button = itemView.findViewById(R.id.btn_share)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_listview_nuts, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nuts = listNuts[position]

        Glide.with(holder.itemView.context)
            .load(nuts.photo)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)

        holder.tvName.text = nuts.name
        holder.tvDesc.text = nuts.desc

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listNuts[position].name,
            Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listNuts[position]) }

    }

    override fun getItemCount(): Int {
        return listNuts.size
    }
}