package com.swoosh.brian.swooshclone.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swoosh.brian.swooshclone.Model.Players
import com.swoosh.brian.swooshclone.R
import com.swoosh.brian.swooshclone.Utilities.Extra_Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

   lateinit var players: Players

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        players = intent.getParcelableExtra(Extra_Player)

        println(players)
    }

    fun onFinishClicked(view: View){

        if (players.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(Extra_Player, players)
            startActivity(finishIntent)

        }else{

            Toast.makeText(this, "Please select a skill level!", Toast.LENGTH_SHORT).show()
        }
    }


    fun onBeginnerClick(view: View){

        ballerSkillBtn.isChecked = false
        players.skill = "beginner"
    }


    fun onBallerClicked(view: View){

        beginnerSkillBtn.isChecked = false
        players.skill = "baller"
    }
}
