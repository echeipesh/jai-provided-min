import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / useCoursier      := false

lazy val root = (project in file("."))
  .settings(
    name := "jai-provided-min",
    libraryDependencies ++= Seq(
      geotoolsCoverage % Provided,
      jaiCore % Provided,
      jaiCodec % Provided,
      imageIo % Provided
    ),
    resolvers += Repositories.osgeoReleases
  )
