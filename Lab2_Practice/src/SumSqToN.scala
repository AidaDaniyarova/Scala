import scala.io.StdIn.*

object SumSqToN {
  //Exercise #17: Logical operators
  def main(args:Array[String]): Unit= {
    print("Enter number: ")
    var N:Int=readInt()
    var sumSq:Int=N * (N + 1) * (2 * N + 1) / 6
    var list = List.range(1,N+1)
    var result:String=""
    for (items <- list) {
      result+= items+"^2 + "
    }
    var len:Int = result.length-2
    result=result.substring(0, len-1)
    result+=(" = "+N +" x "+ (N+1)+" x "+ (2*N+1)+" / 6 =")
    print(result)
    println(sumSq)
  }
}
