package com.wellee.giflibwithglide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wellee.giflibwithglide.extension.GlideApp
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gif = "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2051651383,909700034&fm=26&gp=0.jpg"
//        GlideApp.with(this).asGif2().load(R.drawable.timg).into(iv)
        GlideApp.with(this).asGif2().load(gif).into(iv)
    }
}
