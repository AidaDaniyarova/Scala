import scala.io.StdIn._

object ListMenu {
  //Exercise #9: List analysis menu
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()

    print("Enter end value of list (exclusive) ")
    var end = readInt()

    var xs = List.range(start, end)

    var cmd = ""

    while {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()

      if(cmd=="Take"){
        print("Enter the number of take: ")
        var num:Int = readInt()
        println(xs.take(num))
      }
      else if(cmd=="TakeR"){
        print("Enter the number of right take: ")
        var num: Int = readInt()
        println(xs.takeRight(num))
      }
      else if(cmd=="Drop"){
        print("Enter the number of drop: ")
        var num: Int = readInt()
        println(xs.drop(num))
      }
      else if (cmd == "DropR") {
        print("Enter the number of right drop: ")
        var num: Int = readInt()
        println(xs.dropRight(num))
      }


      (cmd != "End")
    } do ()

    println("Exiting program...")
  }
}