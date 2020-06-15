package tkcore.info.mybasic.progress

import android.app.Dialog
import android.content.Context
import tkcore.info.mybasic.lllogI

object MyCircle {

    var dialog: Dialog? = null

    fun init() {

    }

    fun show(context: Context, waitType: Circle) {
        lllogI("MyCircle MyCircle show start $waitType")
//        dialog?.let {
//            if (it.isShowing) cancel()
//        }
//        lllogI("MyCircle MyCircle show isNotShowing $waitType")
//
//        val b = DialogMyCircleBinding.inflate(LayoutInflater.from(context))
//        b.waitType = waitType
//        b.btnHide.onClick { cancel() }
//
//        /**
//         * 완전 투명하게
//         */
//        dialog = if (waitType.transparent) Dialog(context, R.style.MyCircleDialog)
//        else Dialog(context)
//
//
//        dialog?.apply {
//            requestWindowFeature(Window.FEATURE_NO_TITLE)
//            setContentView(b.root)
//            setCancelable(false)
//            setCanceledOnTouchOutside(false)
//            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//            show()
//        }

    }

    fun cancel() {
        dialog?.let {
            if (it.isShowing) {
                it.dismiss()
                dialog = null
                lllogI("MyCircle MyCircle show dismiss ")
            }
        }
    }

}