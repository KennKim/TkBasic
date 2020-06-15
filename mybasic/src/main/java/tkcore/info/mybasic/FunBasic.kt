package tkcore.info.mybasic
import android.util.Log

/*************************************************************************************/
/********************  ***********************************************************/
/*************************************************************************************/

private val tag = "tttest"
  val test1 = "test111"
fun lllogI(str: String?) {
    Log.i(tag, str?:"none")
}
fun lllogItoast(str: String?) {
    lllogI(str)
//    toastNormal(str)
}

fun lllogW(str: String?) {
    Log.w(tag, str?:"none")
}

fun lllogW(e: Exception) {
    Log.w(tag, e)
}

fun lllogW(str: String?, e: Exception) {
    Log.w(tag, str, e)
}

fun lllogD(str: String?) {
    Log.d(tag, str?:"none")
}

fun lllogD(str: String?, e: Exception) {
    Log.d(tag, str, e)
}

fun lllogE(str: String?) {
    Log.e(tag, str?:"none")
}



///**
// * Toast 날리고나서 true도 날려줄 때.
// */
//fun trueToast(msg: String): Boolean {
//    TToast.showAlert(msg)
//    return true
//}
//
//fun trueToast(strId: Int): Boolean {
//    TToast.showAlert(strId)
//    return true
//}
//
///**
// * when문 else로 빠졌을 때.
// */
//fun errorWhen() {
//    TToast.showNormal(R.string.error_when_else)
//}
