name := "scala-rift-sandbox"

version := "1.0"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Local Maven repository" at Path.userHome.asFile.toURI.toURL + ".m2/repository"
)

libraryDependencies ++= Seq(
  "de.fruitfly.ovr" % "ovr" % "1.0-SNAPSHOT"
)
