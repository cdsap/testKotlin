package com.agoda.mobile

import java.util.*

class ManifestReader(private val file: String) : PermissionReader {
    override fun getReader() = ManifestReaderJ(file).getPermissionsManifest().flatMap { listOf(it.getAtr()) }
}