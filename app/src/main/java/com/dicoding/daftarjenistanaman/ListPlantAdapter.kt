package com.dicoding.daftarjenistanaman

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlantAdapter(private val listPlant: ArrayList<Plant>) : RecyclerView.Adapter<ListPlantAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_plant, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val plant = listPlant[position]

        Glide.with(holder.itemView.context)
            .load(plant.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvNamePlant.text = plant.name
        holder.tvDetailPlant.text = plant.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listPlant[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listPlant.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNamePlant: TextView = itemView.findViewById(R.id.tv_item_name_plant)
        var tvDetailPlant: TextView = itemView.findViewById(R.id.tv_item_detail_plant)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo_plant)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Plant)
    }
}