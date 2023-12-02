package com.shawnbutton.advent2023

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.nio.file.Paths

class AdventTest {
    @Test
    fun should_calculate_sum() {
        val result = sum(1, 2)

        assertEquals(3, result)
    }

    @Test
    fun should_calculate_value_of_line_from_digits() {
        assertEquals(13, calcDigits("x123x"))
        assertEquals(24, calcDigits("234x"))
        assertEquals(35, calcDigits("x345"))
        assertEquals(46, calcDigits("456"))
        assertEquals(77, calcDigits("x7x"))
        assertEquals(88, calcDigits("8"))
    }

    @Test
    fun should_load_file() {
        assertEquals(listOf("first line", "second line"), loadFle("/sample.txt"))
    }



}
