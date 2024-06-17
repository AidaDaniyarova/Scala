import scala.io.StdIn.*

object SumCubesToN {
  //Exercise #18: Input and calculation
  def main(args:Array[String]): Unit= {
    print("Enter number: ")
    val N: Int = readInt()
    val sumCubes: Int = N * N * (N + 1) * (N + 1) / 4
    val list = List.range(1, N + 1)
    var result: String = ""
    for (items <- list) {
      result += items + "^3 + "
    }
    val len: Int = result.length - 2
    result = result.substring(0, len - 1)
    result += (" = " + N*N + " x " + (N + 1)* (N + 1) + " / 4 = ")
    print(result)
    println(sumCubes)
  }
}
