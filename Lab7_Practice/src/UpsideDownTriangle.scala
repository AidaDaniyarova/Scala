import scala.io.StdIn.readInt

object UpsideDownTriangle {
  //Exercise #14: Drawing triangles B)
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    println()

    for (row <- baseHeight to 1 by -1) {
      for (col <- row to 1 by -1) {
        print("* ")
      }
      print("\n")
    }

  }
}