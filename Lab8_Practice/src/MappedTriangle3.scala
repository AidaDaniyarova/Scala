import scala.io.StdIn.readInt

object MappedTriangle3 {
  //Exercise #11: Another mapped triangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    (1 to baseHeight).map(x => "* " * x)
      .map(x => x.formatted(s"%${baseHeight*2}s"))
      .foreach(println)
  }
}