import scala.io.StdIn.*

object ProcessingArrays {
  //Exercise #6: Processing arrays
  def main(args: Array[String]): Unit = {
    print("Enter any number: ")
    var size:Int=readInt()
    var nums = new Array[Int](size)

    for (i <- nums.indices) {
      nums(i) = i + 1
    }

    for (x <- nums) {
      print(x + " ")
    }
  }
}