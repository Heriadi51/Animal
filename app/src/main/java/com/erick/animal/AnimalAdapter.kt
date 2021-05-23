package com.erick.animal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AnimalAdapter(private val listAnimal: ArrayList<Animal>): RecyclerView.Adapter<AnimalAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback

    }

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
//            init {
//                itemView.setOnClickListener {
//                    val position = adapterPosition
//                    val intent = Intent(itemView.context, AnimalDetail::class.java)
//                    intent.putExtra("NAME", )
//                    intent.putExtra("ICON", listIcon[position])
//                    intent.putExtra("DESC", listDesc[position])
//                    itemView.context.startActivity(intent)
//                }
//            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalAdapter.ListViewHolder, position: Int) {
        val animal = listAnimal[position]
        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = animal.name
        holder.tvDetail.text = animal.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listAnimal[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listAnimal.size


    interface OnItemClickCallback {
        fun onItemClicked(data: Animal)
    }
}