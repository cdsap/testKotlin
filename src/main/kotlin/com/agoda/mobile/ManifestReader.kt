package com.agoda.mobile

import java.util.*

class ManifestReader(private val file : String) : PermissionReader {
    override fun getReader(): ArrayList<String> {
        val values : ArrayList<String>

       var manifest = XMLParser().fromXML(file,Manifest()) as Manifest
        manifest.permission!!.forEach { book ->
           // book.permission

        }
        throw UnsupportedOperationException()
    }
}

class Manifest{
    @JvmField var permission: Array<Permission>? = null
}

class Permission{
    @JvmField var value : String? = null
}

class Bookstore {
    @JvmField var book: Array<Book>? = null
}
class Book {
    @JvmField var title: String? = null
    @JvmField var author: String? = null
    @JvmField var price: String? = null
}