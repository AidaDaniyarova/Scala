import scala.io.StdIn.readInt

object TimesTable3 {
  //Exercise #17: Advanced times table grid
  def main(args: Array[String]): Unit = {
    print("Type in a times table size: ")
    val heightWidth = readInt()

    var row: Int = 1
    print("\t ")
    while(row<=heightWidth){
      print(f"$row%5d")
      row+=1
    }
    print("\n     ")
    println("-----"*(row-1))
    row=1
    while (row <= heightWidth) {

      var col: Int = 1
      print(f"$row%3d\t|")
      while (col <= heightWidth) {
        print(f"${col*row}%5d")
        col += 1
      }

      print("\n")
      row += 1
    }
  }

}
