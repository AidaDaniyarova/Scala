import scala.io.StdIn.*

object IPlusJTimesK {
  //Exercise #10: Operator precedence
 def main(args:Array[String]): Unit={
   print("enter i ")
   var i:Int= readInt()
   print("enter j ")
   var j:Int= readInt()
   print("enter k ")
   var k:Int= readInt()
   println(i + j * k) //a)
   println((i + j) * k) //b) Add brackets
 }
}
