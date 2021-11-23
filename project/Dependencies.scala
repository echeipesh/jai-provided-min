import sbt._

object Version {
  val geotools    = "25.0"
}

object Dependencies {
  val geotoolsCoverage    = "org.geotools"                 % "gt-coverage"             % Version.geotools
  val jaiCore             = "javax.media" % "jai_core"     % "1.1.3"
  val jaiCodec            = "javax.media" % "jai_codec"    % "1.1.3"
  val imageIo             = "javax.media" % "jai_imageio"  % "1.1"
}

object Repositories {
  val osgeoReleases   = "osgeo-releases" at "https://repo.osgeo.org/repository/release/"
  val ivy2Local       = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
  val mavenLocal      = Resolver.mavenLocal
  val maven           = DefaultMavenRepository
  val local           = Seq(ivy2Local, mavenLocal)
  val external        = Seq(osgeoReleases, maven)
  val all             = external ++ local
}