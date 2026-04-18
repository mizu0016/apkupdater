package com.mizu.eyecare

import android.content.Context
import android.content.Intent
import androidx.work.Worker
import androidx.work.WorkerParameters

class AlertWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        val intent = Intent(applicationContext, OverlayService::class.java)
        applicationContext.startService(intent)
        return Result.success()
    }
}
