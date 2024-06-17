import scala.io.StdIn.readInt

object MappedTriangle2 {
  //Exercise #10: Mapped triangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    (baseHeight to 1 by -1).map(x => "* " * x).foreach(println)
  }
}