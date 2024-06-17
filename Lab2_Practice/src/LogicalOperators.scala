import scala.io.StdIn.*

object LogicalOperators {
  //Exercise #16: Logical operators
  def main(args:Array[String]): Unit= {
    var True:Boolean = true
    var False:Boolean = false
    println(True.toString + " AND " + False + " is " + (True&&False))
    println(True.toString + " OR " + False + " is " + (True||False)+"\n")

    //Truth Table for AND
    println("Truth Table for AND")
    println("A\t\tB\t\tA AND B")
    println(True.toString + "\t" + True + "\t" + (True&&True))
    println(True.toString + "\t" + False + "\t" + (True&&False))
    println(False.toString + "\t" + True + "\t" + (False&&True))
    println(False.toString + "\t" + False + "\t" + (False&&False)+"\n")

    //Truth Table for OR
    println("Truth Table for OR")
    println("A\t\tB\t\tA OR B")
    println(True.toString + "\t" + True + "\t" + (True||True))
    println(True.toString + "\t" + False + "\t" + (True||False))
    println(False.toString + "\t" + True + "\t" + (False||True))
    println(False.toString + "\t" + False + "\t" + (False||False))
  }
}