package com.kaki.dotinstallapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
            val results = arrayOf("大吉", "吉", "中吉", "小吉", "凶")
            val n = Random().nextInt(results.count())
            if (n.equals(0)) {
                resultTextView.setTextColor(Color.RED)
            } else {
                resultTextView.setTextColor(Color.GRAY)
            }
            resultTextView.text = results.get(n)
        }

    }
}
