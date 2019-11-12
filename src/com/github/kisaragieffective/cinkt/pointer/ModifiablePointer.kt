package com.github.kisaragieffective.cinkt.pointer

interface ModifiablePointer : Pointer {
    fun setValue(value: Any?)
}