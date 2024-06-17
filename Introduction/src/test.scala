import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object test {
  def main(args: Array[String]):Unit={
    var myList = List[Int]()
    var myList2 = ListBuffer[Int](450,55,60)
    println((myList2++myList).sorted)
    var myArray = Array[Int](1)
    var myArray2 = new Array[Int](10)
    var myArrayBuffer = ArrayBuffer[Int](1)
    var myArrayBuffer2 = new ArrayBuffer[Int]()
    var num= myArray2.apply(5)
    var a = List(0, 1, 2, 3)
    myList2.foreach(println)
    val b = a :+ 5 // List(0, 1, 2, 3)
    val c = List(-1, 0) ::: a
    var d = 0 :: a
    println(b)
    println(c)
    println(d)

  }

}
