package com.example.lesson7m5

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun install(){
        math = Math()
    }
    @Test
    fun simpleAddCase(){
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun checkEmpty(){
        assertEquals("вы незаполнили одно из полей ",math?.add("","5"))
    }

    @Test
    fun checkNumber(){
        assertEquals("Нельзя сложить строку ", math?.add(" Выу ", "выаак"))
    }

    @Test
    fun doubleAddCase(){
        assertEquals("4.0",math?.add("2.0","2.0"))
    }
    @Test
    fun simpleNegativeAddCase(){
        assertEquals("нельзя складывать отрицательный число", math?.add("-2", "-2"))
    }

    @After
    fun detach(){
        math = null
    }

}