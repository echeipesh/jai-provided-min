import sbt._

object Version {
  val geotools    = "25.0"
}

object Dependencies {
  val geotoolsCoverage    = "org.geotools"                 % "gt-coverage"             % Version.geotools
  val geotoolsHsql        = "org.geotools"                 % "gt-epsg-hsql"            % Version.geotools
  val geotoolsMain        = "org.geotools"                 % "gt-main"                 % Version.geotools
  val geotoolsReferencing = "org.geotools"                 % "gt-referencing"          % Version.geotools
  val geotoolsGeoTiff     = "org.geotools"                 % "gt-geotiff"              % Version.geotools
  val geotoolsShapefile   = "org.geotools"                 % "gt-shapefile"            % Version.geotools
  val geotoolsMetadata    = "org.geotools"                 % "gt-metadata"             % Version.geotools
  val geotoolsOpengis     = "org.geotools"                 % "gt-opengis"              % Version.geotools
  val jaiCore             = "javax.media" % "jai_core"     % "1.1.3"
  val jaiCodec            = "javax.media" % "jai_codec"    % "1.1.3"
  val imageIo             = "javax.media" % "jai_imageio"  % "1.1"

  val imageioExtUtilities = "it.geosolutions.imageio-ext" % "imageio-ext-utilities" % "1.3.5"
  
  val worksWithDependencies = Seq(jaiCore, jaiCodec, imageIo, imageioExtUtilities).map(_ % Provided)
}

object Repositories {
    val apacheSnapshots = "apache-snapshots" at "https://repository.apache.org/content/repositories/snapshots/"
    val eclipseReleases = "eclipse-releases" at "https://repo.eclipse.org/content/groups/releases"
    val osgeoReleases   = "osgeo-releases" at "https://repo.osgeo.org/repository/release/"
    val geosolutions    = "geosolutions" at "https://maven.geo-solutions.it/"
    val jitpack         = "jitpack" at "https://jitpack.io" // for https://github.com/everit-org/json-schema
    val ivy2Local       = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
    val mavenLocal      = Resolver.mavenLocal
    val maven           = DefaultMavenRepository
    val local           = Seq(ivy2Local, mavenLocal)
    val external        = Seq(osgeoReleases, maven, eclipseReleases, geosolutions, jitpack, apacheSnapshots)
    val all             = external ++ local
  }
