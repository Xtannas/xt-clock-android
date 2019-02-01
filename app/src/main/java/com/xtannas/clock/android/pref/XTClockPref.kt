package com.xtannas.clock.android.pref

import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceActivity
import android.widget.Toast
import com.xtannas.clock.android.R

class XTClockPref : PreferenceActivity() {

    private lateinit var prefObfuscate: Preference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preferences)

        prefObfuscate = preferenceScreen.findPreference("obfuscate")
        prefObfuscate.setOnPreferenceChangeListener { pref, data ->
            if (pref.key != "obfuscate") return@setOnPreferenceChangeListener false

            val data = data as Boolean
            val text = if (data) R.string.obfuscate_on else R.string.obfuscate_off


            Toast.makeText(applicationContext, text, Toast.LENGTH_LONG).show()

            return@setOnPreferenceChangeListener true
        }
    }

}