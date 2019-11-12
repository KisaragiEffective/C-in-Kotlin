package com.github.kisaragieffective.cinkt.string

import com.github.kisaragieffective.cinkt.pointer.GenericPointer

class CString(private val base: CharArray) : NullTerminatedString, Comparable<CString>, Iterable<Char>, CharSequence, GenericPointer<CharArray> {
    override fun compareTo(other: CString): Int {
        return String(this.base).compareTo(String(other.base))
    }

    override fun iterator(): Iterator<Char> {
        return base.iterator()
    }

    override val length: Int
        get() = base.size - 1

    override fun get(index: Int): Char {
        return base[index]
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CString {
        return CString(base.sliceArray(startIndex..endIndex))
    }

    override fun dereference(): CharArray {
        return base
    }
}