package org.live.test.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.live.test.R
import org.live.test.widget.DialogSuccess

/**
 * Created by wl on 2018/9/5.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialogSuccess = DialogSuccess(this)
        dialogSuccess.show()
        // startActivity<GreenDaoActivity>()
    }
}
