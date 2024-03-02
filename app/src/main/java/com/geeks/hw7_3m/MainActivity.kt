package com.geeks.hw7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.geeks.hw7_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.music_container, MusicFragment())
            .commit()
        supportFragmentManager.beginTransaction().add(R.id.playlist_container, PlaylistFragment())
            .commit()
    }
}