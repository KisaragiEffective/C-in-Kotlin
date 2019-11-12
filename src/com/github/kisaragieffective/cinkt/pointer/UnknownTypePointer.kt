package com.github.kisaragieffective.cinkt.pointer

class UnknownTypePointer(private val value: Any) : Pointer {
    override fun dereference(): Any {
        return value
    }
}
