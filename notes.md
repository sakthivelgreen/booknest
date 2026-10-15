## Gradle vs Maven

1. Config: Maven = XML (pom.xml). Gradle = Groovy/Kotlin DSL (build.gradle / build.gradle.kts) — real code, not JSON.
2. Multi-module: Maven lists <modules> in the parent POM. Gradle lists modules in settings.gradle; each module has its own build.gradle.
3. Model: Maven = fixed lifecycle (phases) + plugin goals. Gradle = graph of tasks; custom tasks are easy.
4. Plugins add capabilities (java, war); libraries come from dependencies {} + repositories {} — same split in Maven.
5. Scopes: compile→implementation/api, provided→compileOnly/providedCompile, runtime→runtimeOnly, test→testImplementation.
6. Versions: Maven dependencyManagement ≈ Gradle platform() BOMs / version catalog.
7. Output: Maven target/, Gradle build/.
8. Speed: Gradle has incremental builds, build cache and daemon.
9. Gradle was inspired by Ant and Maven, but is not built on Ant (it can run Ant tasks).
10. Use the wrapper: ./gradlew (and ./mvnw) so everyone runs the same version.