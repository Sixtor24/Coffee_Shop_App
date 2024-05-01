package com.coffee_shop_app

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultReactActivityDelegate
import org.devio.rn.splashscreen.SplashScreen

// Aquí agregamos la definición del objeto DefaultNewArchitectureEntryPoint
object DefaultNewArchitectureEntryPoint {
    fun getFabricEnabled(): Boolean {
        // Aquí debes retornar el valor que determina si Fabric está habilitado o no.
        // Por ahora, retornaremos false como un valor predeterminado.
        return false
    }
}

class MainActivity : ReactActivity() {
    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    override fun getMainComponentName(): String {
        return "Coffee_Shop_App"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        SplashScreen.show(this)
        super.onCreate(savedInstanceState)
    }

    /**
     * Returns the instance of the [ReactActivityDelegate]. Here we use a util class [
     * DefaultReactActivityDelegate] which allows you to easily enable Fabric and Concurrent React
     * (aka React 18) with two boolean flags.
     */
    override fun createReactActivityDelegate(): ReactActivityDelegate {
        return DefaultReactActivityDelegate(
            this,
            mainComponentName,
            DefaultNewArchitectureEntryPoint.getFabricEnabled()
        )
    }
}
