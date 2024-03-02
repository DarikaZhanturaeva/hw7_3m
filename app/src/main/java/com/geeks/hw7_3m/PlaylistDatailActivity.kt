package com.geeks.hw7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.hw7_3m.databinding.ActivitySecondBinding

class PlaylistDatailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receiveData = intent.getStringExtra(Keys.KEY_FOR_PLAYLIST)
        binding.tvSecond.text = receiveData
    }
}