import scala.io.StdIn.*

object MyFirstScalaCode {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    println("Mur...")
    var a = 5
    a=9
    val b = 4
    val c= a+b
    println(c)
    //Data Types
    var n1:Byte = 127
    var n2:Short = 32767
    var n3:Int = 214748647
    var n4:Long = 4848465454L
    var num1:Float = 568.487
    var num2:Double = 54768684.4848648468
    var isValid:Boolean = true
    var singleChar:Char = 'd'
    var text:String = "Hello"
    val k = "boo" * 3
    println(k)

    println("Enter your age")
    val age: Int = readInt()
    val nationality: String = readLine("Enter your Nationality\n")

    if age>=18 || nationality == "Kazakhstan"
      then
    {
      println("You are eligible to vote")
    }
     else
     {
       println("You are not eligible to vote")
     }
     println("Length of the CL: " + args.length)
     println("This is CL argument 1: "+args(0))
    println("This is CL argument 2: "+args(1))
    //println("This is CL argument 3: "+args(2))
    }
}
