import sbt._

object Version {
  val geotools    = "25.0"
}

object Dependencies {
  val geotoolsCoverage    = "org.geotools"                 % "gt-coverage"             % Version.geotools
}

object Repositories {
  val osgeoReleases   = "osgeo-releases" at "https://repo.osgeo.org/repository/release/"
}