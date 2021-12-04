import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val excludedDependencies = List(
    ExclusionRule("javax.media", "jai_core"),
    ExclusionRule("javax.media", "jai_codec"),
    ExclusionRule("javax.media", "jai_imageio")
)

lazy val root = (project in file("."))
  .settings(
    name := "jai-provided-min",
    libraryDependencies ++= Seq(
      geotoolsCoverage,
      geotoolsHsql,
      geotoolsMain,
      geotoolsReferencing,
      geotoolsMetadata,
      geotoolsOpengis
    ).map(_ excludeAll(excludedDependencies: _*)),
    libraryDependencies ++= worksWithDependencies,
    externalResolvers := Repositories.all
  )
