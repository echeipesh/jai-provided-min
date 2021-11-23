import sbt._

object Version {
  val geotools    = "25.0"
}

object Dependencies {
  val geotoolsCoverage    = "org.geotools"                 % "gt-coverage"             % Version.geotools
  val jaiCore             = "javax.media" % "jai_core"     % "1.1.3"
  val jaiCodec            = "javax.media" % "jai_codec"    % "1.1.3"
  val imageIo             = "javax.media" % "jai_imageio"  % "1.1"

  lazy val excludedDependencies = List(
    ExclusionRule("javax.media", "jai_core"),
    ExclusionRule("javax.media", "jai_codec"),
    ExclusionRule("javax.media", "jai_imageio"),
    ExclusionRule("it.geosolutions.imageio-ext"),
    ExclusionRule("jgridshift", "jgridshift"),
    ExclusionRule("jgridshift", "jgridshift-core"),
    ExclusionRule("org.jaitools", "jt-zonalstats"),
    ExclusionRule("org.jaitools", "jt-utils")
  )
}

object Repositories {
  val osgeoReleases   = "osgeo-releases" at "https://repo.osgeo.org/repository/release/"
}
