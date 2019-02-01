package com.xtannas.clock.android.wall.grid

import com.xtannas.clock.android.wall.base.*
import java.util.*

class Grid {

    private val cellsMap = (0 until GRID_SIZE_X).associateWith { x ->
        (0 until GRID_SIZE_Y).associateWith { y -> Cell(x, y) }
    }

    init {
        val lets = ArrayDeque(LETTERS)

        var x = 0
        var y = 0

        while (lets.isNotEmpty()) {
            val cell = this[X(x), Y(y)]

            cell.txt = lets.poll()

            if (x++ == (GRID_SIZE_X - 1)) {
                x = 0

                if (y++ == (GRID_SIZE_Y - 1)) {
                    break
                }
            }
        }
    }


    val cells: List<Cell>
        get() = cellsMap.values.flatMap { it.values }


    operator fun get(x: X): List<Cell> {
        return cellsMap[x.x]?.values?.toList() ?: emptyList()
    }

    operator fun get(y: Y): List<Cell> {
        return cellsMap.mapNotNull { it.value[y.y] }
    }

    operator fun get(x: X, y: Y): Cell {
        return this[x][y.y]
    }

}