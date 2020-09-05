package com.example.drawbl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val draw = drawbl()
        imageView.setOnTouchListener { view, event ->

            var x = event.getX(0 )
            var y = event.getY(0 )

            draw.addToCart(listOf(x, y))

            true
        }

        button_ydoli.setOnClickListener {
            draw.delThis()
        }

        imageView.setImageDrawable(draw)
    }
}
