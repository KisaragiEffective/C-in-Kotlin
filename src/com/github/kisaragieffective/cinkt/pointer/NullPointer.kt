package com.github.kisaragieffective.cinkt.pointer

object NullPointer : GenericPointer<Nothing?> {
    override fun dereference(): Nothing? {
        return null
    }
}