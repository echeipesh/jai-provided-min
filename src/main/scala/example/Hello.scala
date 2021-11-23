package example

import org.geotools.coverage.grid._

trait Hello {
  def convertToTile(gridCoverage: GridCoverage2D, bandIndex: Int): Int = 0
}
