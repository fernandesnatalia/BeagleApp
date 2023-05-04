package com.example.beagleapp.action

import android.view.View
import android.widget.Toast
import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.annotation.RegisterAction
import br.com.zup.beagle.android.widget.RootView

@RegisterAction
data class CustomActionToastButton(val value: String) : Action {
    override fun execute(rootView: RootView, origin: View) {
        Toast.makeText(rootView.getContext(), value, Toast.LENGTH_SHORT).show()
    }
}