import scala.io.StdIn.readInt

object Square {
  //Exercise #13: Nested for expressions a)
  def main(args: Array[String]): Unit = {
    print("Select how many units for each side? ")
    val side = readInt()

    println()

    for (row <- 1 to side) {
      for (col <- 1 to side) {
        print("* ")
      }
      print("\n")
    }

  }
}