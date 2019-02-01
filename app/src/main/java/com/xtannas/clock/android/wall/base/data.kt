package com.xtannas.clock.android.wall.base

const val SIZE = 1440

const val GRID_SIZE_X = 11
const val GRID_SIZE_Y = 10

const val GRID_INSETS = 120
const val GRID_STARTS = (SIZE - (GRID_INSETS * 2.0))

const val GRID_CELL_S_X = GRID_STARTS / GRID_SIZE_X.toDouble()
const val GRID_CELL_S_Y = GRID_STARTS / GRID_SIZE_Y.toDouble()

const val HEIGHT_FACTOR = 12


inline class X(val x: Int)

inline class Y(val y: Int)


val LETTERS = listOf("I", "T", "L", "I", "S", "A", "S", "T", "I", "M", "E",
                     "A", "C", "Q", "U", "A", "R", "T", "E", "R", "D", "C",
                     "T", "W", "E", "N", "T", "Y", "F", "I", "V", "E", "X",
                     "H", "A", "L", "F", "B", "T", "E", "N", "F", "T", "O",
                     "P", "A", "S", "T", "E", "R", "U", "N", "I", "N", "E",
                     "O", "N", "E", "S", "I", "X", "T", "H", "R", "E", "E",
                     "F", "O", "U", "R", "F", "I", "V", "E", "T", "W", "O",
                     "E", "I", "G", "H", "T", "E", "L", "E", "V", "E", "N",
                     "S", "E", "V", "E", "N", "T", "W", "E", "L", "V", "E",
                     "T", "E", "N", "S", "E", "O", "C", "L", "O", "C", "K")