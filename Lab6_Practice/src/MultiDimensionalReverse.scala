import scala.io.StdIn.readInt
import scala.util.Random

object MultiDimensionalReverse {
  //Exercise #13: Processing multi-dimensional arrays
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt();

    println("Cols? ")
    var cols = readInt()

    var table = Array.ofDim[Int](rows,cols)
    var i = 0

    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        table(i)(j) = i + j
        j += 1
      }
      i += 1
    }


    i = table.length - 1

    while (i >= 0) {
      var j = table(i).length - 1
      while (j >= 0) {
        print(f"${table(i)(j)}%4d")
        j -= 1
      }
      print("\n")
      i -= 1
    }

    //Random
    var arow = new Random().nextInt(41)
    var acol = new Random().nextInt(41)

    var tRand = Array.ofDim[Int](arow, acol)
     i = 0

    while (i < tRand.length) {
      var j = 0
      while (j < tRand(i).length) {
        tRand(i)(j) = i + j
        j += 1
      }
      i += 1
    }


    i = tRand.length - 1

    while (i >= 0) {
      var j = tRand(i).length - 1
      while (j >= 0) {
        print(f"${tRand(i)(j)}%4d")
        j -= 1
      }
      print("\n")
      i -= 1
    }
  }
}