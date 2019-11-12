package com.github.kisaragieffective.cinkt.pointer

interface ModifiableGenericPointer<E> : GenericPointer<E> {
    fun setValue(value: E)

    operator fun get(offset: Int)
}