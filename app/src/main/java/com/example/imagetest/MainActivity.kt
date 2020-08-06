package com.example.imagetest

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    private var isShowBig = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            isShowBig = !isShowBig
            iv.setImageResource(if (isShowBig) R.drawable.test_big else R.drawable.test_small)
            tv_des.text = if (isShowBig) "大图" else "小图"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.fix_center -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.FIT_CENTER
                true
            }
            R.id.fix_start -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.FIT_START
                true
            }
            R.id.fix_end -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.FIT_END
                true
            }
            R.id.fix_xy -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.FIT_XY
                true
            }
            R.id.center -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.CENTER
                true
            }
            R.id.center_crop -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.CENTER_CROP
                true
            }
            R.id.center_inside -> {
                tv.text = item.title
                iv.scaleType = ImageView.ScaleType.CENTER_INSIDE
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}