package com.github.ksoichiro.eclipse.aar

import org.gradle.api.Project

class AarPluginExtension {
    Project project
    String androidTarget = 'android-21'
    String aarDependenciesDir = 'aarDependencies'
    String projectNamePrefix = ''
    boolean cleanLibsDirectoryEnabled = true
    String projectName

    AarPluginExtension(Project project) {
        this.project = project
    }
}
