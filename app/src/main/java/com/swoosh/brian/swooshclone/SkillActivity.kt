package com.swoosh.brian.swooshclone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(Extra_League)

        println(league)
    }
}
