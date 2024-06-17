import scala.io.StdIn.*

object Speed {
  //Exercise #11: Calculations
  def main(args:Array[String]): Unit= {
    print("Enter initial speed: ")
    var initial = readFloat()
    print("Enter acceleration: ")
    var acceleration = readFloat()
    print("Enter time: ")
    var time = readInt()
    var finalSpeed = initial + acceleration * time
    println(finalSpeed)
  }
}
