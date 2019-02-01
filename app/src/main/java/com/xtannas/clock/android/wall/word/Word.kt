package com.xtannas.clock.android.wall.word

import com.xtannas.clock.android.wall.base.X
import com.xtannas.clock.android.wall.base.Y
import com.xtannas.clock.android.wall.grid.Cell
import com.xtannas.clock.android.wall.grid.Grid

data class Word(private val cells: List<Pair<X, Y>>) {
    constructor(y : Int, vararg xs: Int): this(xs.map { X(it) to Y(y) })

    operator fun get(grid: Grid): List<Cell> {
        return this.cells.map { grid[it.first, it.second] }
    }

}