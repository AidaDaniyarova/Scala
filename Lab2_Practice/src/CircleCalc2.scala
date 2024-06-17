import scala.io.StdIn.*

object CircleCalc2 {
  //Exercise #20: A different approach
  def main(args:Array[String]): Unit= {
    print("Enter radius of the circle: ")
    val radius: Float = readFloat()
    val pi = scala.math.Pi
    val formatter = java.text.NumberFormat.getNumberInstance
    print("A circle with diameter " + 2 * radius + " has a circumference of " + formatter.format(2 * pi * radius))

  }
}