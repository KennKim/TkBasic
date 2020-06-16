package tkcore.info.mybasic.my_bind

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 */
abstract class BindingActivity<T : ViewDataBinding> : AppCompatActivity() {
    @LayoutRes
    abstract fun getLayoutResId(): Int

    protected lateinit var b: T
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT   // orientation portrate 새로방향 고정.
        b = DataBindingUtil.setContentView(this, getLayoutResId())
    }

    override fun onDestroy() {
        super.onDestroy()
//        MyCircle.cancel()
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        lllogI("BannerManageActivity BindingActivity onActivityResult")
//        if (resultCode == RESULT_OK) {
//            when (requestCode) {
//                REQ_BANNER -> {
//
//                }
//            }
//        }
//    }


}