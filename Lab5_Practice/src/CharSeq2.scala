import scala.io.StdIn.*

object CharSeq2 {
  //Exercise #4: Order independent character sequence
  def main(args:Array[Short]): Unit={
    println("Start character? ")
    var start: Char = readChar()

    println("End character? ")
    var end: Char = readChar()

    while (end <= start) {
      print(end + " ")
      end = (end - 1).toChar
    }
  }
}
