package com.shawnbutton.advent2024.day06

import kotlin.test.Test
import kotlin.test.assertEquals

class Day06Test {


    val testInput = listOf(
        "....#.....",
        ".........#",
        "..........",
        "..#.......",
        ".......#..",
        "..........",
        ".#..^.....",
        "........#.",
        "#.........",
        "......#..."
    )


    @Test
    fun should_load_grid() {
        val given = listOf(
            "ABC",
            "123"
        )

        assertEquals(listOf(listOf("A", "B", "C"), listOf("1", "2", "3")), toGrid(given))
    }

    @Test
    fun should_get_starting_position() {
        val grid = toGrid(testInput)

        assertEquals(Pair(4,6), getStartingPos(grid))
    }


    @Test
    fun should_do_test_grid() {
        val grid = toGrid(testInput)

        countSteps(grid)


    }

}