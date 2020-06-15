package tkcore.info.mybasic.progress

import android.content.Context


/********************************  myProgresss *****************************************/
const val PROGRESS_NOTHING = 10
const val PROGRESS_AV = 30
const val PROGRESS_CIRCLE = 60

enum class Circle(val progress: Int, val transparent: Boolean, val hasPercent: Boolean, val hasCancelBtn: Boolean, val info: String?) {
    EMPTY(PROGRESS_NOTHING, true, false, false, null),   // 아무것도 없음.
    BASIC_1(PROGRESS_AV, true, false, false, null),  // 로딩만. av
    BASIC_2(PROGRESS_CIRCLE, true, false, false, null),  // 로딩만. circle
    FULL_AV(PROGRESS_AV, false, false, false, null),  // 로딩만. circle
    FULL_CIRCLE(PROGRESS_CIRCLE, false, false, false, null),  // 로딩만. circle

    // percent랑 같이.
    PERCENT(PROGRESS_CIRCLE, false, true, false,null),

    ;

    fun show(context: Context) {
        MyCircle.show(context, this)
    }
}


