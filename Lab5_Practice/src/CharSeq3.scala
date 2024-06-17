import scala.io.StdIn.readChar

object CharSeq3 {
  //Exercise #5: Ascending and descending character sequences
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()

    println("End character? ")
    var end: Char = readChar()

    if(start.hashCode()<end.hashCode()) {
      while (start <= end) {
        print(start + " ")
        start = (start + 1).toChar
      }
    }
    else{
      while (end <= start) {
        print(start + " ")
        start = (start - 1).toChar
      }
    }
  }
}