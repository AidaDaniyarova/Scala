import scala.io.StdIn.*

object LowerCaesar {
  //Exercise #12: Rotating characters
  def main(args:Array[String]):Unit={
    var sentence = readLine("Enter any sentence to encrypt and then number: ").toLowerCase
    var numRotation = readInt()
    var result = for(x <-sentence) yield (((x+numRotation)-97)%26+97).toChar
    println("Encrypted sentence is: "+ result)
  }

}
