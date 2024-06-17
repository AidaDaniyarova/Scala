import scala.io.StdIn.*

object OddIndex {
  //Exercise #4: Shorthand array initialisation
  def main(args: Array[String]): Unit = {

    var nums = new Array[Double](10)
    var count=0
    while(count<10){
      nums(count)=readDouble()
      count+=1
    }
    var i = 8
    while (i >=0) {
      println("Index: " + i + " ; Value: " + nums(i))
      i -= 2
    }
  }
}