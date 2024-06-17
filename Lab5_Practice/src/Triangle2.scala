import scala.io.StdIn.readInt

object Triangle2 {
  //Exercise #15: Upside down triangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    println()

    var row: Int = baseHeight

    while (row >= 0) {

      var col: Int = 1

      while (col <= row) {
        print("* ")
        col += 1
      }

      print("\n")
      row -= 1
    }

  }
}