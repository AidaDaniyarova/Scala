import scala.io.StdIn.readInt

object Triangle1 {
  //Exercise #14: Drawing a triangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    println()

    var row: Int = 1

    while (row <= baseHeight) {

      var col: Int = 1

      while (col <= row) {
        print("* ")
        col += 1
      }

      print("\n")
      row += 1
    }

  }
}