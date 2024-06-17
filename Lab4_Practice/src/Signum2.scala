import scala.io.StdIn.readInt

object Signum2 {
  //Exercise #3: Introducing if else-if else b)
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()

    var message = if(number>=0)
      "positive"
    else
      "negative"

    println(s"$number is $message")
  }
}