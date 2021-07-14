package net.devsmine.swipeDroidTest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.devsmine.swipeDroid.SwipePager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<SwipePager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }
}
