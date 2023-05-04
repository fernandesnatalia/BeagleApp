package com.example.beagleapp.widgetView

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.zup.beagle.android.components.Image
import br.com.zup.beagle.android.components.Text
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.core.ServerDrivenComponent
import com.example.beagleapp.R
import com.example.beagleapp.beagle.TAG

class CustomPageViewComponent(context: Context) : ConstraintLayout(context) {

    fun getData(
        children: List<ServerDrivenComponent>,
        context: Context,
        rootView: RootView,
        position: Int
    )  {
        val imageView = R.id.imageViewCarousel
        for (item in children){
            when(item){
                is Image -> {
                    getViewById(imageView)
                    LayoutInflater.from(context).inflate(R.layout.carousel_item_layout,this@CustomPageViewComponent)
                    Log.e(TAG,"to aqui seila")
                }
                is Text -> {

                }
            }
        }
    }
}