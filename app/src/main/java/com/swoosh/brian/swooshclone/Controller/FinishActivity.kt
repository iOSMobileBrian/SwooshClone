package com.swoosh.brian.swooshclone.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.swoosh.brian.swooshclone.Model.Players
import com.swoosh.brian.swooshclone.R
import com.swoosh.brian.swooshclone.Utilities.Extra_Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

       val player = intent.getParcelableExtra<Players>(Extra_Player)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you...."
    }
}
