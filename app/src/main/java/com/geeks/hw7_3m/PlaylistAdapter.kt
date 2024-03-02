package com.geeks.hw7_3m

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.hw7_3m.databinding.ItemPlaylistBinding


class PlaylistAdapter(
    val playlist: ArrayList<Playlist>,
    private val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPlaylistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = playlist.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playlist[position])
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }


}

class ViewHolder(private var binding: ItemPlaylistBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(playlist: Playlist) {
        binding.apply {
            playlist.apply {
                tvName.text = name
                tvTime.text = time
                tvMusician.text = musician
                tvNumber.text = position.toString()
            }
        }
    }
}
