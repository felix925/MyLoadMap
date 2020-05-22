package dependencies

import dependencies.Dep.LibraryVersion.kotlin

object Dep {
    private object LibraryVersion {
        val kotlin = "1.3.72"
    }

    object GradlePlugin {
        val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin"
    }
}