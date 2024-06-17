import scala.io.StdIn.*

object WordFilter {
  //Exercise #7: Word filter
  def main(args:Array[String]):Unit={
    var words = new Array[String](5)
    for(i <- words.indices){
      words(i)=readLine(s"The ${i+1} word is: ")
    }
    var chars = new Array[Char](5)
    for (i <- chars.indices) {
      print(s"The ${i+1} character is: ")
      chars(i) = readChar()
    }

    for(i<-chars){
      words.filter(_.startsWith(i.toString)).foreach(println)}

  }
}
