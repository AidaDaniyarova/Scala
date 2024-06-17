import scala.io.StdIn.readInt

object XToOne  {
  //Exercise #1: Introducing iteration b)
  def main(args: Array[String]): Unit = {
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()

    while (max > 0) { //condition - iterate whilst true
      println(f"$max%4d")
      max-=1 //update - by incrementing count
    }
  }
}