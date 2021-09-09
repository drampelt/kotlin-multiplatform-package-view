package com.github.drampelt.kotlinmultiplatformpackageview.services

import com.intellij.openapi.project.Project
import com.github.drampelt.kotlinmultiplatformpackageview.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
