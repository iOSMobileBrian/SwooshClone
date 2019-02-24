package com.swoosh.brian.swooshclone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClick(view:View){

        val skillActivityView = Intent(this, SkillActivity::class.java)
        startActivity(skillActivityView)
    }
}
