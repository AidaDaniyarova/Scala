import scala.io.StdIn.*

object Calculator {
def main(args:Array[String]): Unit= {
  var running = true
  while (running) {
    //Match
    println("------Standard Calculator------")
    println("Menu: 1.Add\t2.Sub\t3.Div\t4.Mul\t5/6.Exit")
    print("Enter your choice: ")
    var choice = readLine()
    choice match
      case "1" =>
        print("Enter number 1: ")
        var num1 = readInt()
        print("Enter number 2: ")
        var num2 = readInt()
        println("Sum = " + (num1 + num2))
      case "2" =>
        print("Enter number 1: ")
        var num1 = readInt()
        print("Enter number 2: ")
        var num2 = readInt()
        var sub=num1-num2
        println(s"Subtraction = $sub")
      case "3" =>
        print("Enter number 1: ")
        var num1 = readInt()
        print("Enter number 2: ")
        var num2 = readInt()
        println("Division = " + (num1 / num2))
      case "4" =>
        print("Enter number 1: ")
        var num1 = readFloat()
        print("Enter number 2: ")
        var num2 = readFloat()
        var mul=num1*num2
        var name="Dmuk"
        println(f"Multiplication = $mul%10.2f $name%10s")
      case "5" | "6" =>
        System.exit(0) // or Breaks
      case _ =>
        println("Invalid choice")
  }
  }
}
