# Cucumber-Skeleton-CLI-example

Cannot seem to find a good example to show how to use Cucumber-JVM without maven when I was doing a project, therefore documenting here.

Here is a working example
Cucumber-Skeleton test from CLI example

To Package step definition to Jar file

jar cvf cucum.jar -C  src/ .


TO Run

java -cp "\*:./jars/\*" cucumber.api.cli.Main -p pretty   --glue test features
