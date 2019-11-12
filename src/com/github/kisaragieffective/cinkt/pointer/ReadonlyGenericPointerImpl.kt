package com.github.kisaragieffective.cinkt.pointer

class ReadonlyGenericPointerImpl<E>(val element: E) : GenericPointer<E> {
    override fun dereference(): E {
        return element
    }
}