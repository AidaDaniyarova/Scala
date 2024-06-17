import scala.io.StdIn.readChar

object CharSeq1 {
  //Exercise #3: Producing a character sequence
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()

    println("End character? ")
    var end: Char = readChar()

    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
  }
}