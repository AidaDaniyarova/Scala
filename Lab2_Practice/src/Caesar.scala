import scala.io.StdIn.*

object Caesar {
  //Exercise #21: caesar
  def main(args:Array[String]): Unit= {
    print("Enter any char to encrypt: ")
    var single:Char=readChar().toLower
    print("Enter any number to shift: ")
    var shift:Int=readInt()
    var result:Char=(((single+shift)-97)%26+97).toChar
    print(result)
  }
}