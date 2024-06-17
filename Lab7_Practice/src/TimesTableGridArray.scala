import scala.io.StdIn.readInt

object TimesTableGridArray {
  //Exercise #18: Working with two-dimensional arrays
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt();

    println("Cols? ")
    var cols = readInt()

    //POPULATE APPROACH 1
    var table = Array.ofDim[Int](rows,cols)

    for (i <- 0 until rows; j <- 0 until cols) {
      table(i)(j) = (i+1) * (j+1)
    }

    //POPULATE APPROACH 2
    //var table = for (i <- (1 to rows).toArray) yield for (j <- (1 to cols).toArray) yield i*j


    //OUTPUT APPROACH 1
    for (i <- 0 until rows; j <- 0 until cols) {
      print(f"${table(i)(j)}%4d")
      if (j == cols-1) println()
    }

    //OUTPUT APPROACH 2
    /*for (row <- table) {
      for (col <- row) {
        print(f"$col%4d")
      }
      println()
    }*/

    var shape = for (i <- (1 to rows).toArray) yield for (j <- (1 to cols).toArray) yield '*'
    for (row <-shape){
      for (col <- row){
        print(col)
      }
      println()
    }

  }
}