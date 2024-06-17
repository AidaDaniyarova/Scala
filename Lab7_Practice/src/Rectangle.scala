import scala.io.StdIn.readInt

object Rectangle {
  //Exercise #13: Nested for expressions b)
  def main(args: Array[String]): Unit = {
    print("Select how many units for height? ")
    val height = readInt()
    print("Select how many units for width? ")
    val width = readInt()

    println()

    for (row <- 1 to height) {
      for (col <- 1 to width) {
        print("* ")
      }
      print("\n")
    }

  }
}