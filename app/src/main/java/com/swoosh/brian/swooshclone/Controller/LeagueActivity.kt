package com.swoosh.brian.swooshclone.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swoosh.brian.swooshclone.Model.Players
import com.swoosh.brian.swooshclone.R
import com.swoosh.brian.swooshclone.Utilities.Extra_Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Players("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClick(view:View){

        if (player.league != "") {
            val skillActivityView = Intent(this, SkillActivity::class.java)
            skillActivityView.putExtra(Extra_Player, player)
            startActivity(skillActivityView)

        }else{

            Toast.makeText(this, "Please Select a League to Play in!",Toast.LENGTH_SHORT).show()

        }
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }


    fun onWomensClicked(view: View) {
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "womens"


    }


    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "coed"
    }
}
