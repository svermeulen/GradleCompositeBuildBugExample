package foo

import org.gradle.api.*
import org.gradle.api.tasks.*

class FooTask extends DefaultTask {
  @TaskAction
  def run() {
    println 'hi'
  }
}

