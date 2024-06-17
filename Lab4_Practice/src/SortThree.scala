import scala.io.StdIn.*

object SortThree {
  //Exercise  #14: Simple sort
  def main(args: Array[String]): Unit={
    print("Enter three numbers: ")
    val a=readInt()
    val b=readInt()
    val c=readInt()
    var max:Int=0
    var med:Int=0
    var min:Int=0

    if (a > b) {
      if (a > c) {
        max = a;
        if (b > c) {
          med = b;
          min = c;
        } else {
          med = c;
          min = b;
        }
      } else {
        med = a;
        max = c;
        min = b;
      }
    } else {
      if (b > c) {
        max = b;
        if (a > c) {
          med = a;
          min = c;
        } else {
          med = c;
          min = a;
        }
      } else {
        med = b;
        max = c;
        min = a;
      }
    }

    println(s"$min, $med, $max")
  }
}
