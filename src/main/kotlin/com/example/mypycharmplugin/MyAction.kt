package com.yourname

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDate

class AddInfoToReadme : AnAction("Add Author Info to README") {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val readmeFilePath = Paths.get(project.basePath, "README.md")

        if (Files.exists(readmeFilePath)) {
            val author = "ogrock3t (Askar)"
            val mail = "abubakirov.offical@yandex.ru"
            val telegram = "@og_rock3t"
            val university = "ITMO Software Engineering student"
            val dateCreated = LocalDate.now().toString()

            val content = Files.readAllLines(readmeFilePath).toMutableList()

            val authorInfo = "\n\n## Information about of author:\n### Author: $author\n### Education: $university\n### Email: $mail\n### Telegram: $telegram\n### Date Created: $dateCreated"

            content.add(authorInfo)

            Files.write(readmeFilePath, content)
        } else {
            println("README.md file not found")
        }
    }
}