package com.example.beagleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.networking.RequestData
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ServerDrivenActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(newServerDrivenIntent<ServerDrivenActivity>(RequestData("/397b1eee-04f2-4103-a0ba-d02c77e5b1bd")))
    }
}