import scala.io.StdIn.*

object RelationalCharacters {
  //Exercise #15: Relational operators
  def main(args:Array[String]): Unit= {
    println("Enter two whole numbers: ")
    var is:Boolean=true
    var a:Int = readInt()
    var b:Int =readInt()
    if(a<b)
      println(a+" < "+ b+" is "+ is)
    else println(a+" < "+ b+" is "+ !is)

    if (a > b)
      println(a + " > " + b + " is " + is)
    else println(a + " > " + b + " is " + !is)

    if (a <= b)
      println(a + " <= " + b + " is " + is)
    else println(a + " <= " + b + " is " + !is)

    if (a >= b)
      println(a + " >= " + b + " is " + is)
    else println(a + " >= " + b + " is " + !is)

    if (a == b)
      println(a + " == " + b + " is " + is)
    else println(a + " == " + b + " is " + !is)

    if (a != b)
      println(a + " != " + b + " is " + is)
    else println(a + " != " + b + " is " + !is)
    }
  }
