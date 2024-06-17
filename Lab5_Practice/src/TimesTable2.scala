import scala.io.StdIn.readInt

object TimesTable2 {
  //Exercise #13: Generating a times table grid
  def main(args: Array[String]): Unit = {
    print("Type in a times table size: ")
    val heightWidth = readInt()

    var row: Int = 1

    while (row <= heightWidth) {

      var col: Int = 1

      while (col <= heightWidth) {
        print(f"${col*row}%5d")
        col += 1
      }

      print("\n")
      row += 1
    }
  }

}
