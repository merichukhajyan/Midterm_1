package com.example.midterm_1

import java.util.*
object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        val myS = Scanner(System.`in`)
        println("How many disks does your tower A consist of?")
        val n = myS.nextInt()
        midterm(n)
    }

    fun midterm(n: Int) {
        helper(n, 'A', 'B', 'C')
    }

    fun helper(n: Int, a: Char, b: Char, c: Char) {
        if (n == 1) {
            println("Move disk 1 from pole $a to pole $b")
            return
        }
        helper(n - 1, a, c, b)
        println("Move disk $n from pole $a to pole $b")
        helper(n - 1, c, b, a)
    }
}