## Java Syntax

```bash
brew tap AdoptOpenJDK/homebrew-openjdk
brew cask install adoptopenjdk14
/usr/libexec/java_home -V

 export JAVA_HOME=(/usr/libexec/java_home -v 14.0.1)
```

```
mvn -B archetype:generate \
    -DarchetypeGroupId=org.apache.maven.archetypes \
    -DgroupId=wk \
    -DartifactId=java-syntax

mvn compile
```

## Resources

- https://www.techgeeknext.com/java/java14-features
- https://blog.codefx.org/java/enable-preview-language-features
- http://www.baeldung.com/java-8-new-features
- https://www.journaldev.com/2389/java-8-features-with-examples
- https://stackoverflow.com/questions/15496/hidden-features-of-java
- https://jaxenter.com/java-10-is-finally-here-lets-have-a-look-at-its-new-features-142654.html
- https://zeroturnaround.com/rebellabs/java-10-and-beyond-a-look-at-the-potential-language-change
- https://www.azul.com/jdk-13-81-new-features-and-apis