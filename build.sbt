import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "vcnc",
      scalaVersion := "2.11.11",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Baltimore",
    libraryDependencies += scalaTest % Test, 
    libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided",
    libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided",

    mainClass in assembly := Some("vcnc.baltimore.BaltimoreMigrate"),
    assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false)
  )
