package com.shawnbutton.advent2023.day09

import com.shawnbutton.advent2023.loadFile
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day09Test {

    val line1 = "0 3 6 9 12 15"
    val line2 = "1 3 6 10 15 21"
    val line3 = "10 13 16 21 30 45"



    @Test
    fun `should parse history line`() {
        assertEquals(listOf(0, 3, 6, 9, 12, 15), parseHistory(line1))
    }


    @Test
    fun doPartA() {
//        val lines = loadFile("/day09.txt")
//        assertEquals(542529149, doPartA(lines))
    }
}