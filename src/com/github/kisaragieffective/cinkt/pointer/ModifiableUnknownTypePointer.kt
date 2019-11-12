package com.github.kisaragieffective.cinkt.pointer

class ModifiableUnknownTypePointer(private var value: Any) : ModifiableGenericPointer<Any> {
    override fun setValue(value: Any) {
        this.value = value
    }

    override fun dereference(): Any {
        return value
    }
}