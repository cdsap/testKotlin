package com.agoda.mobile

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginConvention


class ManifestCheckerPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        print("hello")
    }
}