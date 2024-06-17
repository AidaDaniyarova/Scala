import scala.io.StdIn.*

object ProcessingArrays2 {
  //Exercise #2: Processing arrays b)
  def main(args: Array[String]): Unit = {
    var nums = new Array[String](10)

    var i = 0
    while (i < nums.length) {
      nums(i) = readLine()
      i += 1
    }

    i = 0
    while (i <10) {
      println(nums(i))
      i += 1
    }
  }
}