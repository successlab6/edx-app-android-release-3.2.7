package org.edx.mobile.module.prefs

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CourseCalendarPrefs @Inject constructor(@ApplicationContext context: Context) {
    private val pref: PrefManager = PrefManager(context, PrefManager.Pref.COURSE_CALENDAR_PREF)

    fun setSyncAlertPopupDisabled(key: String, isEnabled: Boolean) {
        pref.put(key, isEnabled)
    }

    fun isSyncAlertPopupDisabled(key: String): Boolean = pref.getBoolean(key, false)
}
