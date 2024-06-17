import scala.io.StdIn.readInt

object MappedTriangle {
  //Exercise #12: Creating your own mapped triangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    (1 to baseHeight).map(x => "* " * x)
      .map(x => x.formatted(s"%${baseHeight*2}s"))
      .foreach(println)
  }
}