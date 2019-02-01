package com.xtannas.clock.android.wall.base

fun <T : Any> combine(vararg collections: Collection<T>): List<T> {
    return collections.flatMap { it }
}