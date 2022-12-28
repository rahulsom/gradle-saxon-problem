plugins {
  id("java")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to null))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "dom"))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "dom4j"))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "jdom"))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "s9api"))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "xom"))
  implementation(mapOf("group" to "net.sourceforge.saxon", "name" to "saxon", "version" to "9.1.0.8", "classifier" to "xqj"))
}
