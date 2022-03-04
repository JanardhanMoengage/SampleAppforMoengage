package com.example.sampleappformoengage

import android.app.Application
import android.util.Log
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel
import com.moengage.core.MoEngage
import com.moengage.core.config.DataSyncConfig
import com.moengage.core.config.FcmConfig
import com.moengage.core.config.LogConfig
import com.moengage.core.internal.data.isDataTrackingEnabled

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("testing", "Inside application class method onCreate()")
        val moEngage = MoEngage.Builder(this, "NBZ7V0U8Y3KODMQL3ZDEI4FM")
            .configureLogs(
                LogConfig(
                    LogLevel.VERBOSE,
                    true
                )
            )
            .configureFcm(FcmConfig(false))
            .configureDataSync(DataSyncConfig(
                true,
                -1,
                true
            ))
            .build()
        MoEngage.initialise(moEngage)

    }
}