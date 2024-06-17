import scala.io.StdIn.*

object FlatMapCaesar {
  //Exercise #9: Caesar using maps
  def main(args:Array[String]):Unit={
    print("Enter the rotation: ")
    var rot = readInt()
    var words = Array("Mse", "crete", "t", "messiah", "s", "ageing")
    var takenWord =for(i <- words) yield i.take(3)
    var flattenWord=takenWord.flatten
    var filteredWord =flattenWord.filter(_.isLower)
    var mappedWord = filteredWord.map(x=>(x+rot).toChar)
    mappedWord.foreach(x=> println(s"${(x-rot).toChar} -> $x"))
  }
}
