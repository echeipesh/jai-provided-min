import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "jai-provided-min",
    libraryDependencies ++= Seq(
      geotoolsCoverage % Provided,
      scalaTest % Test
    ),
    resolvers += Repositories.osgeoReleases
  )
