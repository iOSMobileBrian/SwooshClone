package com.swoosh.brian.swooshclone.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.swoosh.brian.swooshclone.R
import com.swoosh.brian.swooshclone.Utilities.Extra_League
import com.swoosh.brian.swooshclone.Utilities.Extra_Skill
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(Extra_League)
        val skill = intent.getStringExtra(Extra_Skill)

        searchLeaguesText.text = "Looking for $league $skill league near you...."
    }
}
