package com.example.submissiondicoding

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListBijuuAdapter (private val listBijuu: ArrayList<Bijuu>, private val context: Context): RecyclerView.Adapter<ListBijuuAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_bijuu, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        holder.itemView.setOnClickListener {
            val getData = listBijuu.get(position)
            val DetailName: String = getData.name
            val DetailDesc: String = getData.details
            val DetailDescription: String = getData.description
            val DetailPhoto: Int = getData.photo
            val DetailBg: Int = getData.background


            val moveToDetail = Intent(context, DetailActivity::class.java)
            moveToDetail.putExtra("mName", DetailName)
            moveToDetail.putExtra("mDetail", DetailDesc)
            moveToDetail.putExtra("mDescription", DetailDescription)
            moveToDetail.putExtra("mPhoto", DetailPhoto)
            moveToDetail.putExtra("mBg", DetailBg)
            context.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listBijuu.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(bijuu: Bijuu) {
            var name: TextView = itemView.findViewById(R.id.bijuu_name)
            var details: TextView = itemView.findViewById(R.id.bijuu_details)
            var photo: ImageView = itemView.findViewById(R.id.bijuu_photo)

            name.text = bijuu.name
            details.text = bijuu.details
            photo.setImageResource(bijuu.photo)
        }
    }
}