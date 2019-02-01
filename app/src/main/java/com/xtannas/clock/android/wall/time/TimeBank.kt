@file:Suppress("MemberVisibilityCanBePrivate")

package com.xtannas.clock.android.wall.time

import com.xtannas.clock.android.wall.base.combine
import com.xtannas.clock.android.wall.word.WordBank.A
import com.xtannas.clock.android.wall.word.WordBank.EIGHT
import com.xtannas.clock.android.wall.word.WordBank.ELEVEN
import com.xtannas.clock.android.wall.word.WordBank.FIVE_0
import com.xtannas.clock.android.wall.word.WordBank.FIVE_1
import com.xtannas.clock.android.wall.word.WordBank.FOUR
import com.xtannas.clock.android.wall.word.WordBank.HALF
import com.xtannas.clock.android.wall.word.WordBank.IS
import com.xtannas.clock.android.wall.word.WordBank.IT
import com.xtannas.clock.android.wall.word.WordBank.NINE
import com.xtannas.clock.android.wall.word.WordBank.OCLOCK
import com.xtannas.clock.android.wall.word.WordBank.ONE
import com.xtannas.clock.android.wall.word.WordBank.PAST
import com.xtannas.clock.android.wall.word.WordBank.QUARTER
import com.xtannas.clock.android.wall.word.WordBank.SEVEN
import com.xtannas.clock.android.wall.word.WordBank.SIX
import com.xtannas.clock.android.wall.word.WordBank.TEN_0
import com.xtannas.clock.android.wall.word.WordBank.TEN_1
import com.xtannas.clock.android.wall.word.WordBank.THREE
import com.xtannas.clock.android.wall.word.WordBank.TO
import com.xtannas.clock.android.wall.word.WordBank.TWELVE
import com.xtannas.clock.android.wall.word.WordBank.TWENTY
import com.xtannas.clock.android.wall.word.WordBank.TWO


import java.time.LocalDateTime

object TimeBank {

    // 01:00
    val IT_IS_01_OCLOCK = Time(IT, IS, ONE, OCLOCK)
    // 02:00
    val IT_IS_02_OCLOCK = Time(IT, IS, TWO, OCLOCK)
    // 03:00
    val IT_IS_03_OCLOCK = Time(IT, IS, THREE, OCLOCK)
    // 04:00
    val IT_IS_04_OCLOCK = Time(IT, IS, FOUR, OCLOCK)
    // 05:00
    val IT_IS_05_OCLOCK = Time(IT, IS, FIVE_1, OCLOCK)
    // 06:00
    val IT_IS_06_OCLOCK = Time(IT, IS, SIX, OCLOCK)
    // 07:00
    val IT_IS_07_OCLOCK = Time(IT, IS, SEVEN, OCLOCK)
    // 08:00
    val IT_IS_08_OCLOCK = Time(IT, IS, EIGHT, OCLOCK)
    // 09:00
    val IT_IS_09_OCLOCK = Time(IT, IS, NINE, OCLOCK)
    // 10:00
    val IT_IS_10_OCLOCK = Time(IT, IS, TEN_1, OCLOCK)
    // 11:00
    val IT_IS_11_OCLOCK = Time(IT, IS, ELEVEN, OCLOCK)
    // 12:00
    val IT_IS_12_OCLOCK = Time(IT, IS, TWELVE, OCLOCK)

    // 01:05
    val IT_IS_FIVE_PAST_01 = Time(IT, IS, FIVE_0, PAST, ONE)
    // 02:05
    val IT_IS_FIVE_PAST_02 = Time(IT, IS, FIVE_0, PAST, TWO)
    // 03:05
    val IT_IS_FIVE_PAST_03 = Time(IT, IS, FIVE_0, PAST, THREE)
    // 04:05
    val IT_IS_FIVE_PAST_04 = Time(IT, IS, FIVE_0, PAST, FOUR)
    // 05:05
    val IT_IS_FIVE_PAST_05 = Time(IT, IS, FIVE_0, PAST, FIVE_1)
    // 06:05
    val IT_IS_FIVE_PAST_06 = Time(IT, IS, FIVE_0, PAST, SIX)
    // 07:05
    val IT_IS_FIVE_PAST_07 = Time(IT, IS, FIVE_0, PAST, SEVEN)
    // 08:05
    val IT_IS_FIVE_PAST_08 = Time(IT, IS, FIVE_0, PAST, EIGHT)
    // 09:05
    val IT_IS_FIVE_PAST_09 = Time(IT, IS, FIVE_0, PAST, NINE)
    // 10:05
    val IT_IS_FIVE_PAST_10 = Time(IT, IS, FIVE_0, PAST, TEN_1)
    // 11:05
    val IT_IS_FIVE_PAST_11 = Time(IT, IS, FIVE_0, PAST, ELEVEN)
    // 12:05
    val IT_IS_FIVE_PAST_12 = Time(IT, IS, FIVE_0, PAST, TWELVE)

    // 01:10
    val IT_IS_TEN_PAST_01 = Time(IT, IS, TEN_0, PAST, ONE)
    // 02:10
    val IT_IS_TEN_PAST_02 = Time(IT, IS, TEN_0, PAST, TWO)
    // 03:10
    val IT_IS_TEN_PAST_03 = Time(IT, IS, TEN_0, PAST, THREE)
    // 04:10
    val IT_IS_TEN_PAST_04 = Time(IT, IS, TEN_0, PAST, FOUR)
    // 05:10
    val IT_IS_TEN_PAST_05 = Time(IT, IS, TEN_0, PAST, FIVE_1)
    // 06:10
    val IT_IS_TEN_PAST_06 = Time(IT, IS, TEN_0, PAST, SIX)
    // 07:10
    val IT_IS_TEN_PAST_07 = Time(IT, IS, TEN_0, PAST, SEVEN)
    // 08:10
    val IT_IS_TEN_PAST_08 = Time(IT, IS, TEN_0, PAST, EIGHT)
    // 09:10
    val IT_IS_TEN_PAST_09 = Time(IT, IS, TEN_0, PAST, NINE)
    // 10:10
    val IT_IS_TEN_PAST_10 = Time(IT, IS, TEN_0, PAST, TEN_1)
    // 11:10
    val IT_IS_TEN_PAST_11 = Time(IT, IS, TEN_0, PAST, ELEVEN)
    // 12:10
    val IT_IS_TEN_PAST_12 = Time(IT, IS, TEN_0, PAST, TWELVE)

    // 01:15
    val IT_IS_A_QUARTER_PAST_01 = Time(IT, IS, A, QUARTER, PAST, ONE)
    // 02:15
    val IT_IS_A_QUARTER_PAST_02 = Time(IT, IS, A, QUARTER, PAST, TWO)
    // 03:15
    val IT_IS_A_QUARTER_PAST_03 = Time(IT, IS, A, QUARTER, PAST, THREE)
    // 04:15
    val IT_IS_A_QUARTER_PAST_04 = Time(IT, IS, A, QUARTER, PAST, FOUR)
    // 05:15
    val IT_IS_A_QUARTER_PAST_05 = Time(IT, IS, A, QUARTER, PAST, FIVE_1)
    // 06:15
    val IT_IS_A_QUARTER_PAST_06 = Time(IT, IS, A, QUARTER, PAST, SIX)
    // 07:15
    val IT_IS_A_QUARTER_PAST_07 = Time(IT, IS, A, QUARTER, PAST, SEVEN)
    // 08:15
    val IT_IS_A_QUARTER_PAST_08 = Time(IT, IS, A, QUARTER, PAST, EIGHT)
    // 09:15
    val IT_IS_A_QUARTER_PAST_09 = Time(IT, IS, A, QUARTER, PAST, NINE)
    // 10:15
    val IT_IS_A_QUARTER_PAST_10 = Time(IT, IS, A, QUARTER, PAST, TEN_1)
    // 11:15
    val IT_IS_A_QUARTER_PAST_11 = Time(IT, IS, A, QUARTER, PAST, ELEVEN)
    // 12:15
    val IT_IS_A_QUARTER_PAST_12 = Time(IT, IS, A, QUARTER, PAST, TWELVE)

    // 01:20
    val IT_IS_TWENTY_PAST_01 = Time(IT, IS, TWENTY, PAST, ONE)
    // 02:20
    val IT_IS_TWENTY_PAST_02 = Time(IT, IS, TWENTY, PAST, TWO)
    // 03:20
    val IT_IS_TWENTY_PAST_03 = Time(IT, IS, TWENTY, PAST, THREE)
    // 04:20
    val IT_IS_TWENTY_PAST_04 = Time(IT, IS, TWENTY, PAST, FOUR)
    // 05:20
    val IT_IS_TWENTY_PAST_05 = Time(IT, IS, TWENTY, PAST, FIVE_1)
    // 06:20
    val IT_IS_TWENTY_PAST_06 = Time(IT, IS, TWENTY, PAST, SIX)
    // 07:20
    val IT_IS_TWENTY_PAST_07 = Time(IT, IS, TWENTY, PAST, SEVEN)
    // 08:20
    val IT_IS_TWENTY_PAST_08 = Time(IT, IS, TWENTY, PAST, EIGHT)
    // 09:20
    val IT_IS_TWENTY_PAST_09 = Time(IT, IS, TWENTY, PAST, NINE)
    // 10:20
    val IT_IS_TWENTY_PAST_10 = Time(IT, IS, TWENTY, PAST, TEN_1)
    // 11:20
    val IT_IS_TWENTY_PAST_11 = Time(IT, IS, TWENTY, PAST, ELEVEN)
    // 12:20
    val IT_IS_TWENTY_PAST_12 = Time(IT, IS, TWENTY, PAST, TWELVE)

    // 01:25
    val IT_IS_TWENTY_FIVE_PAST_01 = Time(IT, IS, TWENTY, FIVE_0, PAST, ONE)
    // 02:25
    val IT_IS_TWENTY_FIVE_PAST_02 = Time(IT, IS, TWENTY, FIVE_0, PAST, TWO)
    // 03:25
    val IT_IS_TWENTY_FIVE_PAST_03 = Time(IT, IS, TWENTY, FIVE_0, PAST, THREE)
    // 04:25
    val IT_IS_TWENTY_FIVE_PAST_04 = Time(IT, IS, TWENTY, FIVE_0, PAST, FOUR)
    // 05:25
    val IT_IS_TWENTY_FIVE_PAST_05 = Time(IT, IS, TWENTY, FIVE_0, PAST, FIVE_1)
    // 06:25
    val IT_IS_TWENTY_FIVE_PAST_06 = Time(IT, IS, TWENTY, FIVE_0, PAST, SIX)
    // 07:25
    val IT_IS_TWENTY_FIVE_PAST_07 = Time(IT, IS, TWENTY, FIVE_0, PAST, SEVEN)
    // 08:25
    val IT_IS_TWENTY_FIVE_PAST_08 = Time(IT, IS, TWENTY, FIVE_0, PAST, EIGHT)
    // 09:25
    val IT_IS_TWENTY_FIVE_PAST_09 = Time(IT, IS, TWENTY, FIVE_0, PAST, NINE)
    // 10:25
    val IT_IS_TWENTY_FIVE_PAST_10 = Time(IT, IS, TWENTY, FIVE_0, PAST, TEN_1)
    // 11:25
    val IT_IS_TWENTY_FIVE_PAST_11 = Time(IT, IS, TWENTY, FIVE_0, PAST, ELEVEN)
    // 12:25
    val IT_IS_TWENTY_FIVE_PAST_12 = Time(IT, IS, TWENTY, FIVE_0, PAST, TWELVE)

    // 01:30
    val IT_IS_HALF_PAST_01 = Time(IT, IS, HALF, PAST, ONE)
    // 02:30
    val IT_IS_HALF_PAST_02 = Time(IT, IS, HALF, PAST, TWO)
    // 03:30
    val IT_IS_HALF_PAST_03 = Time(IT, IS, HALF, PAST, THREE)
    // 04:30
    val IT_IS_HALF_PAST_04 = Time(IT, IS, HALF, PAST, FOUR)
    // 04:30
    val IT_IS_HALF_PAST_05 = Time(IT, IS, HALF, PAST, FIVE_1)
    // 06:30
    val IT_IS_HALF_PAST_06 = Time(IT, IS, HALF, PAST, SIX)
    // 07:30
    val IT_IS_HALF_PAST_07 = Time(IT, IS, HALF, PAST, SEVEN)
    // 08:30
    val IT_IS_HALF_PAST_08 = Time(IT, IS, HALF, PAST, EIGHT)
    // 09:30
    val IT_IS_HALF_PAST_09 = Time(IT, IS, HALF, PAST, NINE)
    // 10:30
    val IT_IS_HALF_PAST_10 = Time(IT, IS, HALF, PAST, TEN_1)
    // 11:30
    val IT_IS_HALF_PAST_11 = Time(IT, IS, HALF, PAST, ELEVEN)
    // 12:30
    val IT_IS_HALF_PAST_12 = Time(IT, IS, HALF, PAST, TWELVE)

    // 12:40
    val IT_IS_TWENTY_TO_01 = Time(IT, IS, TWENTY, TO, ONE)
    // 01:40
    val IT_IS_TWENTY_TO_02 = Time(IT, IS, TWENTY, TO, TWO)
    // 02:40
    val IT_IS_TWENTY_TO_03 = Time(IT, IS, TWENTY, TO, THREE)
    // 03:40
    val IT_IS_TWENTY_TO_04 = Time(IT, IS, TWENTY, TO, FOUR)
    // 04:40
    val IT_IS_TWENTY_TO_05 = Time(IT, IS, TWENTY, TO, FIVE_1)
    // 05:40
    val IT_IS_TWENTY_TO_06 = Time(IT, IS, TWENTY, TO, SIX)
    // 06:40
    val IT_IS_TWENTY_TO_07 = Time(IT, IS, TWENTY, TO, SEVEN)
    // 07:40
    val IT_IS_TWENTY_TO_08 = Time(IT, IS, TWENTY, TO, EIGHT)
    // 08:40
    val IT_IS_TWENTY_TO_09 = Time(IT, IS, TWENTY, TO, NINE)
    // 09:40
    val IT_IS_TWENTY_TO_10 = Time(IT, IS, TWENTY, TO, TEN_1)
    // 10:40
    val IT_IS_TWENTY_TO_11 = Time(IT, IS, TWENTY, TO, ELEVEN)
    // 11:40
    val IT_IS_TWENTY_TO_12 = Time(IT, IS, TWENTY, TO, TWELVE)
    
    // 12:45
    val IT_IS_A_QUARTER_TO_01 = Time(IT, IS, A, QUARTER, TO, ONE)
    // 01:45
    val IT_IS_A_QUARTER_TO_02 = Time(IT, IS, A, QUARTER, TO, TWO)
    // 02:45
    val IT_IS_A_QUARTER_TO_03 = Time(IT, IS, A, QUARTER, TO, THREE)
    // 03:45
    val IT_IS_A_QUARTER_TO_04 = Time(IT, IS, A, QUARTER, TO, FOUR)
    // 04:45
    val IT_IS_A_QUARTER_TO_05 = Time(IT, IS, A, QUARTER, TO, FIVE_1)
    // 05:45
    val IT_IS_A_QUARTER_TO_06 = Time(IT, IS, A, QUARTER, TO, SIX)
    // 06:45
    val IT_IS_A_QUARTER_TO_07 = Time(IT, IS, A, QUARTER, TO, SEVEN)
    // 07:45
    val IT_IS_A_QUARTER_TO_08 = Time(IT, IS, A, QUARTER, TO, EIGHT)
    // 08:45
    val IT_IS_A_QUARTER_TO_09 = Time(IT, IS, A, QUARTER, TO, NINE)
    // 09:45
    val IT_IS_A_QUARTER_TO_10 = Time(IT, IS, A, QUARTER, TO, TEN_1)
    // 10:45
    val IT_IS_A_QUARTER_TO_11 = Time(IT, IS, A, QUARTER, TO, ELEVEN)
    // 11:45
    val IT_IS_A_QUARTER_TO_12 = Time(IT, IS, A, QUARTER, TO, TWELVE)

    // 12:50
    val IT_IS_TEN_TO_01 = Time(IT, IS, TEN_0, TO, ONE)
    // 01:50
    val IT_IS_TEN_TO_02 = Time(IT, IS, TEN_0, TO, TWO)
    // 02:50
    val IT_IS_TEN_TO_03 = Time(IT, IS, TEN_0, TO, THREE)
    // 03:50
    val IT_IS_TEN_TO_04 = Time(IT, IS, TEN_0, TO, FOUR)
    // 04:50
    val IT_IS_TEN_TO_05 = Time(IT, IS, TEN_0, TO, FIVE_1)
    // 05:50
    val IT_IS_TEN_TO_06 = Time(IT, IS, TEN_0, TO, SIX)
    // 06:50
    val IT_IS_TEN_TO_07 = Time(IT, IS, TEN_0, TO, SEVEN)
    // 07:50
    val IT_IS_TEN_TO_08 = Time(IT, IS, TEN_0, TO, EIGHT)
    // 08:50
    val IT_IS_TEN_TO_09 = Time(IT, IS, TEN_0, TO, NINE)
    // 09:50
    val IT_IS_TEN_TO_10 = Time(IT, IS, TEN_0, TO, TEN_1)
    // 10:50
    val IT_IS_TEN_TO_11 = Time(IT, IS, TEN_0, TO, ELEVEN)
    // 11:50
    val IT_IS_TEN_TO_12 = Time(IT, IS, TEN_0, TO, TWELVE)

    // 12:55
    val IT_IS_FIVE_TO_01 = Time(IT, IS, FIVE_0, TO, ONE)
    // 01:55
    val IT_IS_FIVE_TO_02 = Time(IT, IS, FIVE_0, TO, TWO)
    // 02:55
    val IT_IS_FIVE_TO_03 = Time(IT, IS, FIVE_0, TO, THREE)
    // 03:55
    val IT_IS_FIVE_TO_04 = Time(IT, IS, FIVE_0, TO, FOUR)
    // 04:55
    val IT_IS_FIVE_TO_05 = Time(IT, IS, FIVE_0, TO, FIVE_1)
    // 05:55
    val IT_IS_FIVE_TO_06 = Time(IT, IS, FIVE_0, TO, SIX)
    // 06:55
    val IT_IS_FIVE_TO_07 = Time(IT, IS, FIVE_0, TO, SEVEN)
    // 07:55
    val IT_IS_FIVE_TO_08 = Time(IT, IS, FIVE_0, TO, EIGHT)
    // 08:55
    val IT_IS_FIVE_TO_09 = Time(IT, IS, FIVE_0, TO, NINE)
    // 09:55
    val IT_IS_FIVE_TO_10 = Time(IT, IS, FIVE_0, TO, TEN_1)
    // 10:55
    val IT_IS_FIVE_TO_11 = Time(IT, IS, FIVE_0, TO, ELEVEN)
    // 11:55
    val IT_IS_FIVE_TO_12 = Time(IT, IS, FIVE_0, TO, TWELVE)


    private val _00_o = listOf(IT_IS_01_OCLOCK, IT_IS_02_OCLOCK, IT_IS_03_OCLOCK, IT_IS_04_OCLOCK, IT_IS_05_OCLOCK, IT_IS_06_OCLOCK, IT_IS_07_OCLOCK, IT_IS_08_OCLOCK, IT_IS_09_OCLOCK, IT_IS_10_OCLOCK, IT_IS_11_OCLOCK, IT_IS_12_OCLOCK)
    private val _05_p = listOf(IT_IS_FIVE_PAST_01, IT_IS_FIVE_PAST_02, IT_IS_FIVE_PAST_03, IT_IS_FIVE_PAST_04, IT_IS_FIVE_PAST_05, IT_IS_FIVE_PAST_06, IT_IS_FIVE_PAST_07, IT_IS_FIVE_PAST_08, IT_IS_FIVE_PAST_09, IT_IS_FIVE_PAST_10, IT_IS_FIVE_PAST_11, IT_IS_FIVE_PAST_12)
    private val _10_p = listOf(IT_IS_TEN_PAST_01, IT_IS_TEN_PAST_02, IT_IS_TEN_PAST_03, IT_IS_TEN_PAST_04, IT_IS_TEN_PAST_05, IT_IS_TEN_PAST_06, IT_IS_TEN_PAST_07, IT_IS_TEN_PAST_08, IT_IS_TEN_PAST_09, IT_IS_TEN_PAST_10, IT_IS_TEN_PAST_11, IT_IS_TEN_PAST_12)
    private val _15_p = listOf(IT_IS_A_QUARTER_PAST_01, IT_IS_A_QUARTER_PAST_02, IT_IS_A_QUARTER_PAST_03, IT_IS_A_QUARTER_PAST_04, IT_IS_A_QUARTER_PAST_05, IT_IS_A_QUARTER_PAST_06, IT_IS_A_QUARTER_PAST_07, IT_IS_A_QUARTER_PAST_08, IT_IS_A_QUARTER_PAST_09, IT_IS_A_QUARTER_PAST_10, IT_IS_A_QUARTER_PAST_11, IT_IS_A_QUARTER_PAST_12)
    private val _20_p = listOf(IT_IS_TWENTY_PAST_01, IT_IS_TWENTY_PAST_02, IT_IS_TWENTY_PAST_03, IT_IS_TWENTY_PAST_04, IT_IS_TWENTY_PAST_05, IT_IS_TWENTY_PAST_06, IT_IS_TWENTY_PAST_07, IT_IS_TWENTY_PAST_08, IT_IS_TWENTY_PAST_09, IT_IS_TWENTY_PAST_10, IT_IS_TWENTY_PAST_11, IT_IS_TWENTY_PAST_12)
    private val _25_p = listOf(IT_IS_TWENTY_FIVE_PAST_01, IT_IS_TWENTY_FIVE_PAST_02, IT_IS_TWENTY_FIVE_PAST_03, IT_IS_TWENTY_FIVE_PAST_04, IT_IS_TWENTY_FIVE_PAST_05, IT_IS_TWENTY_FIVE_PAST_06, IT_IS_TWENTY_FIVE_PAST_07, IT_IS_TWENTY_FIVE_PAST_08, IT_IS_TWENTY_FIVE_PAST_09, IT_IS_TWENTY_FIVE_PAST_10, IT_IS_TWENTY_FIVE_PAST_11, IT_IS_TWENTY_FIVE_PAST_12)
    private val _30_p = listOf(IT_IS_HALF_PAST_01, IT_IS_HALF_PAST_02, IT_IS_HALF_PAST_03, IT_IS_HALF_PAST_04, IT_IS_HALF_PAST_05, IT_IS_HALF_PAST_06, IT_IS_HALF_PAST_07, IT_IS_HALF_PAST_08, IT_IS_HALF_PAST_09, IT_IS_HALF_PAST_10, IT_IS_HALF_PAST_11, IT_IS_HALF_PAST_12)
    private val _40_t = listOf(IT_IS_TWENTY_TO_01, IT_IS_TWENTY_TO_02, IT_IS_TWENTY_TO_03, IT_IS_TWENTY_TO_04, IT_IS_TWENTY_TO_05, IT_IS_TWENTY_TO_06, IT_IS_TWENTY_TO_07, IT_IS_TWENTY_TO_08, IT_IS_TWENTY_TO_09, IT_IS_TWENTY_TO_10, IT_IS_TWENTY_TO_11, IT_IS_TWENTY_TO_12)
    private val _45_t = listOf(IT_IS_A_QUARTER_TO_01, IT_IS_A_QUARTER_TO_02, IT_IS_A_QUARTER_TO_03, IT_IS_A_QUARTER_TO_04, IT_IS_A_QUARTER_TO_05, IT_IS_A_QUARTER_TO_06, IT_IS_A_QUARTER_TO_07, IT_IS_A_QUARTER_TO_08, IT_IS_A_QUARTER_TO_09, IT_IS_A_QUARTER_TO_10, IT_IS_A_QUARTER_TO_11, IT_IS_A_QUARTER_TO_12)
    private val _50_t = listOf(IT_IS_TEN_TO_01, IT_IS_TEN_TO_02, IT_IS_TEN_TO_03, IT_IS_TEN_TO_04, IT_IS_TEN_TO_05, IT_IS_TEN_TO_06, IT_IS_TEN_TO_07, IT_IS_TEN_TO_08, IT_IS_TEN_TO_09, IT_IS_TEN_TO_10, IT_IS_TEN_TO_11, IT_IS_TEN_TO_12)
    private val _55_t = listOf(IT_IS_FIVE_TO_01, IT_IS_FIVE_TO_02, IT_IS_FIVE_TO_03, IT_IS_FIVE_TO_04, IT_IS_FIVE_TO_05, IT_IS_FIVE_TO_06, IT_IS_FIVE_TO_07, IT_IS_FIVE_TO_08, IT_IS_FIVE_TO_09, IT_IS_FIVE_TO_10, IT_IS_FIVE_TO_11, IT_IS_FIVE_TO_12)


    val values = combine(_00_o, _05_p, _10_p, _15_p, _20_p, _25_p, _30_p, _40_t, _45_t, _50_t, _55_t)


    fun search(): Time {
        val time = LocalDateTime.now()

        val m = time.minute
        var h = time.hour

        when {
            h == 0 -> h = 12
            h > 12 -> h -= 12
        }

        val l = when {
            m <  5 -> _00_o
            m < 10 -> _05_p
            m < 15 -> _10_p
            m < 20 -> _15_p
            m < 25 -> _20_p
            m < 30 -> _25_p
            m < 40 -> _30_p
            m < 45 -> _40_t
            m < 50 -> _45_t
            m < 55 -> _50_t
            else   -> _55_t
        }

        val index = if (m < 40) {
            h - 1
        } else {
            if (h == 12) 0 else h
        }

        return l[index]
    }

}