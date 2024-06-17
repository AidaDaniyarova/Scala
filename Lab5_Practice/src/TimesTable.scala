import scala.io.StdIn.*

object TimesTable {
  //Exercise #2: Writing your first while loop
  def main(args: Array[String]):Unit={
    print("Enter number: ")
    var num=readInt()
    var count:Int = 1
    while(count<=12) {
      println(f"$count\tX\t$num\t=\t${count * num}%4d")
      count+=1
      }

  }
}
