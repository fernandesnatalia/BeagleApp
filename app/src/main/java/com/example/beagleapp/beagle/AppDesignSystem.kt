package com.example.beagleapp.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun containerStyle(id: String): Int? {
        return when(id){
            "card" -> null
            else -> null
        }
    }
}