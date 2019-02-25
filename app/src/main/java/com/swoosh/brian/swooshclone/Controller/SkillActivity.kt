package com.swoosh.brian.swooshclone.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swoosh.brian.swooshclone.Utilities.Extra_League
import com.swoosh.brian.swooshclone.R
import com.swoosh.brian.swooshclone.Utilities.Extra_Skill
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(Extra_League)

        println(league)
    }

    fun onFinishClicked(view: View){

        if (skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(Extra_League, league)
            finishIntent.putExtra(Extra_Skill, skill)
            startActivity(finishIntent)

        }else{

            Toast.makeText(this, "Please select a skill level!", Toast.LENGTH_SHORT).show()
        }
    }


    fun onBeginnerClick(view: View){

        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }


    fun onBallerClicked(view: View){

        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }
}
