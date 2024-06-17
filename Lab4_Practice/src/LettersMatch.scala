import scala.io.StdIn.*

object LettersMatch {
  //Exercise  #13: Letter matcher
  def main(args: Array[String]): Unit={
    var running = true
    while (running) {
      print("Enter character of alphabet: ")
      var input: Char = readChar().toLower
      if(input.hashCode() >= 97 && input.hashCode() <= 122) {
        input match {
          case 'a' | 'e' | 'u' | 'i' | 'o' => println("Vowel")
          case _ => println("Consonant")
        }
      
      } else println("Invalid input")
      }
    }
}
