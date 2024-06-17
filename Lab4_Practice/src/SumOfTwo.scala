import scala.io.StdIn.*

object SumOfTwo {
  //Exercise #5: Further exploring conditional logic
  def main(args: Array[String]): Unit = {
    print("Enter three numbers: ")
    var num1=readInt()
    var num2=readInt()
    var num3=readInt()

    if(num1+num2==num3 || num1+num3==num2 || num2+num3==num1) println("YES")
    else println("NO")

  }
}
