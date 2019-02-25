package com.swoosh.brian.swooshclone.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swoosh.brian.swooshclone.Utilities.Extra_League
import com.swoosh.brian.swooshclone.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClick(view:View){

        if (selectedLeague != "") {
            val skillActivityView = Intent(this, SkillActivity::class.java)
            skillActivityView.putExtra(Extra_League,selectedLeague)
            startActivity(skillActivityView)

        }else{

            Toast.makeText(this, "Please Select a League to Play in!",Toast.LENGTH_SHORT).show()

        }
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }


    fun onWomensClicked(view: View) {
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        selectedLeague = "womens"


    }


    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "coed"
    }
}
