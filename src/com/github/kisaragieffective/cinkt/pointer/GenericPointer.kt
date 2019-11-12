package com.github.kisaragieffective.cinkt.pointer

interface GenericPointer<out E> : Pointer {
    override fun dereference(): E
}