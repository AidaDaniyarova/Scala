import scala.io.StdIn.*

object TimesTable {
  //Exercise #5: Refactoring a previous solution
  def main(args:Array[String]):Unit={
    print("Enter number: ")
    var num:Int=readInt()
    for(i <-1 to 12){
      println(f"$i%2d x $num = ${i*num}%2d")
    }
  }

}
