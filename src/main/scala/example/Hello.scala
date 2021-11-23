package example

import org.geotools.coverage.grid._

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
  def convertToTile(gridCoverage: GridCoverage2D, bandIndex: Int): Tile = null
}
