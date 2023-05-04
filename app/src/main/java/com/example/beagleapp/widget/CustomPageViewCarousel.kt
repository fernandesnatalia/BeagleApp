package com.example.beagleapp.widget

import android.view.View
import br.com.zup.beagle.android.annotation.RegisterWidget
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.android.widget.core.ServerDrivenComponent
import com.example.beagleapp.widgetView.CustomPageViewComponent

@RegisterWidget("customPageViewCarousel")
class CustomPageViewCarousel(
    private val children: List<ServerDrivenComponent>
) : WidgetView() {
    override fun buildView(rootView: RootView): View {

        val context = rootView.getContext()
        val customPageView = CustomPageViewComponent(context)
        customPageView.getData(
            children = children,
            context = context,
            rootView = rootView,
            position = children.size
        )
        return customPageView
    }
}