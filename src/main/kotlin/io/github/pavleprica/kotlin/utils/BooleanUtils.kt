package io.github.pavleprica.kotlin.utils

inline fun isNot(actualValue: Boolean): Boolean = !actualValue

inline fun isNot(actualValueBlock: () -> Boolean): Boolean = !actualValueBlock()