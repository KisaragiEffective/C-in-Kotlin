package com.github.kisaragieffective.cinkt.pointer

class ModifiableGenericPointerImpl<E>(private var element: E) : ModifiableGenericPointer<E> {
    override fun setValue(value: E) {
        element = value
    }

    override fun dereference(): E {
        return element
    }
}