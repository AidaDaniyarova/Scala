import scala.io.StdIn.*

object Letters {
  //Exercise  #12: Letter identifier
  def main(args: Array[String]): Unit={
    var running = true
    while(running) {
      print("Enter character of alphabet: ")
      var input: Char = readChar().toLower
      if (input.hashCode() >= 97 && input.hashCode() <= 122)
        if (input == 'e' || input == 'u' || input == 'i' || input == 'o' || input == 'a') println("Vowel")
        else println("Consonant")
      else println("Not alphabet input")
    }
  }
}
