package com.agoda.mobile

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CheckerTest {

    @Test
    fun shouldBeEqualsSameListOfPermissions() {
        val permissions = arrayListOf( "A" , "2")
        val authorizedPermissions = arrayListOf( "2" , "A")
        var checker = Checker(permissions,authorizedPermissions)
        assertTrue(checker.compare())
    }
}