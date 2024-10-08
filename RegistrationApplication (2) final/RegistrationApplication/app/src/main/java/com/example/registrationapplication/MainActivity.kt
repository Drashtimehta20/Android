package com.example.registrationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pb: ProgressBar =findViewById(R.id.progress_circular)
        Thread(Runnable {
            var count=0
            while (count<=150){
                Thread.sleep(50)
                count++
                pb.setProgress(count)
                pb.secondaryProgress=count+10
            }
            if(count>=100){
                var i= Intent(this,SecondActivity::class.java)
                startActivity(i)
            }
        }).start()
    }
}