package com.agoda.mobile

import java.util.*

class Checker(private val authorizedPermissions: ArrayList<String>,
              private val permissions: ArrayList<String>) {

    fun compare() : Boolean {
        sort()
        return authorizedPermissions.equals(permissions)
    }

    fun sort() {
        authorizedPermissions.sort()
        permissions.sort()
    }

}