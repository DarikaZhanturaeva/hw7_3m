package com.geeks.hw7_3m

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geeks.hw7_3m.databinding.FragmentPlaylistBinding


class PlaylistFragment : Fragment() {
    private lateinit var binding: FragmentPlaylistBinding
    private val playlist = arrayListOf(
        Playlist(upPosition(), "Unforgettable", "French Montana", "3:00"),
        Playlist(upPosition(), "Hurts so good", "evymiu", "3:00"),
        Playlist(upPosition(), "Under my skin", "Blue System", "3:00"),
        Playlist(upPosition(), "Sugar", "Zubi & Anatu", "3:00"),
        Playlist(upPosition(), "Yes to heaven", "Lana Del Rey", "3:00"),
        Playlist(upPosition(), "Una Mattina", "Nick Kech", "3:00"),
        Playlist(upPosition(), "After Hours", "The Weekend", "3:00"),
        Playlist(upPosition(), "Dance up", "Miyagi", "3:00"),
        Playlist(upPosition(), "Streets", "Doja Cat", "3:00"),
        Playlist(upPosition(), "Brooklyn Baby", "Lana Del Rey", "3:00")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlaylistBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PlaylistAdapter(playlist, this::onClick)
        binding.rvPlaylist.adapter = adapter
    }

    private fun onClick(position: Int) {
        val music = playlist[position].name
        val intent = Intent(activity, PlaylistDatailActivity::class.java)
        intent.putExtra(Keys.KEY_FOR_PLAYLIST, music)
        startActivity(intent)
    }

    private var position = 1
    private fun upPosition(): Int {
        return position++
    }
}
