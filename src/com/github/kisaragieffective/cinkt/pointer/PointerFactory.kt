package com.github.kisaragieffective.cinkt.pointer

@Suppress("UNCHECKED_CAST")
fun <E : Any?> pointer(e: Any?): GenericPointer<E> {
    return when (e) {
        is Nothing? -> NullPointer as GenericPointer<Nothing>
        else -> ReadonlyGenericPointerImpl(e as E)
    }
}
