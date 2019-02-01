package com.xtannas.clock.android.wall.time

import com.xtannas.clock.android.wall.grid.Cell
import com.xtannas.clock.android.wall.grid.Grid
import com.xtannas.clock.android.wall.word.Word

class Time(private val words: List<Word>) {
    constructor(vararg words: Word): this(words.toList())

    operator fun get(grid: Grid): List<Cell> {
        return this.words.flatMap { it[grid] }
    }

}