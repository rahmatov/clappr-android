package com.globo.clappr.app

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem

//import com.globo.clappr.Player

class PlayerActivity : Activity() {

//    private var player: Player? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        if (savedInstanceState == null) {
//            player = Player.newInstance()
//            fragmentManager.beginTransaction().add(R.id.container, player).commit()
        }

        Handler().postDelayed(object : Runnable {
            override fun run() {
//                player!!.load("http://bem.tv/superMisto.mp4")
            }
        }, 100)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.player, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}