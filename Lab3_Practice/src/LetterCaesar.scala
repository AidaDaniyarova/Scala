import scala.io.StdIn.*

object LetterCaesar {
  //Exercise #11: Shifting letters in a string
  def main(args: Array[String]): Unit = {
    print("Enter any letter to encrypt: ")
    var letter: String = readLine().toLowerCase
    print("Enter any number to shift: ")
    var shift: Int = readInt()
    var i: Int = 0
    var result = ""
    for (char <- letter) {
      result += (((char + shift) - 97) % 26 + 97).toChar.toString
    }

    print(result)
  }
}
