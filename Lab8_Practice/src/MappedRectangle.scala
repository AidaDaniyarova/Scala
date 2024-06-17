import scala.io.StdIn.*

object MappedRectangle {
  //Exercise #13: Creating a mapped rectangle
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height? ")
    var height:Int=readInt()
    print("Select how many units for the width? ")
    var width:Int=readInt()
    (1 to height).map(x => "* "*width).foreach(println)

  }
}
