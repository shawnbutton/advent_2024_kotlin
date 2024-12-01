package com.shawnbutton.advent2023

import com.shawnbutton.advent2024.loadFile
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LoadFileTest {
    @Test
    fun should_load_file() {
        assertEquals(listOf("first line", "second line"), loadFile("/sample.txt"))
    }

}