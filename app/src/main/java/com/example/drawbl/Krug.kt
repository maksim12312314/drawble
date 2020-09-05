package com.example.drawbl

import android.graphics.*
import android.graphics.drawable.Drawable

class drawbl (): Drawable() {
   // var coordX = bounds.exactCenterX()
   // var coordY = bounds.exactCenterY()
    var coords: MutableList<List<Float>> = mutableListOf(listOf(0f, 0f))

//    set(value) {
//        coords.add(item)
//        invalidateSelf()
//    }
    fun addToCart (item:List<Float>) {
    coords.add(item)
    invalidateSelf()

    }
    fun delThis () {
        coords = mutableListOf(listOf(0f, 0f))
        invalidateSelf()
    }

    override fun draw(canvas: Canvas) {
        canvas?.let {
            val ourColor = Paint().apply {
                color = 0x55efc40a.toInt()
            }
            val rect = Rect().apply {
                set(0, 0, bounds.right, bounds.bottom)
            }
            val paint = Paint().apply {
                color = 0x6c5ce70a.toInt()
            }
            canvas.drawRect(rect, paint)
        //    var x = coordX
            //var y = coordY
            if (coords.size>0) {
                coords.forEach{
                    canvas.drawCircle(it[0], it[1], 100f, ourColor)

                }
            }


        }
    }

    override fun setAlpha(alpha: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOpacity(): Int = PixelFormat.TRANSLUCENT

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
