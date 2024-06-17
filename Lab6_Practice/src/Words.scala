import scala.io.StdIn.*

object Words {
  //Exercise #6: Writing your own program using arrays
  def main(args: Array[String]): Unit={

    println("How many words would you like to store? ")
    var size = readInt()

    var words = new Array[String](size)

    var i = 0
    while (i < words.length) {
      println("Number " + (i + 1) + " ? ")
      words(i) = readLine()
      i += 1
    }

    println("You typed in: ")
    i = 0
    while (i < words.length) {
      print(words(i).toUpperCase() + " ")
      i += 1
    }

    var sum:Double=0
    var sizeD:Double=size
    i=0
    while (i < words.length) {
      sum+=words(i).length
      i += 1
    }
    println(sum)
    var average: Double = sum / sizeD
    println(f"The average of word length is $average%.2f")

  }
}
