package com.example.sampleappformoengage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.moe.pushlibrary.MoEHelper
import com.moengage.core.MoEngage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {

        val button1 = findViewById<AppCompatButton>(R.id.track_user_attributes)

        button1.setOnClickListener {
            MoEHelper.getInstance(
                this@MainActivity
            ).setUniqueId("Namaste!Welcomer")
        }
        val button2 = findViewById<AppCompatButton>(R.id.track_user_details)

        button2.setOnClickListener {
            MoEHelper.getInstance(
                this@MainActivity
            ).setFirstName("Jonathan")
            MoEHelper.getInstance(
                this@MainActivity
            ).setLastName("Mange")
            MoEHelper.getInstance(
                this@MainActivity
            ).setEmail("hello@moengage.com")
        }

        val button3 = findViewById<AppCompatButton>(R.id.track_custom_attributes)

        button3.setOnClickListener {
            MoEHelper.getInstance(
                this@MainActivity
            ).setUserAttribute("custom_attr", "name")
        }
        val button4 = findViewById<AppCompatButton>(R.id.track_logout)

        button4.setOnClickListener {
            MoEHelper.getInstance(this).logoutUser()
        }
    }
}

