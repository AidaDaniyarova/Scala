import scala.io.StdIn.*

object CircleCalc {
  //Exercise #19: Using variables for calculations
  def main(args:Array[String]): Unit= {
    print("Enter radius of the circle: ")
    val radius:Float =readFloat()
    val pi=scala.math.Pi
    val formatter = java.text.NumberFormat.getNumberInstance
    val res=formatter.format(2*pi*radius)
    print("A circle with diameter "+2*radius+" has a circumference of "+ res)
  }
}