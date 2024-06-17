object SimpleLists {
  //Exercise #7: Using lists
  def main(args: Array[String]): Unit = {
    //a) Run the code
    var xs: List[Int] = List(4, 1, 8, 45, 3)

    println(xs)
    println(xs.head)
    println(xs.tail)
    println(xs.isEmpty)
    println(xs.tail.isEmpty)
    var xs2: List[Int] = xs.reverse
    println(xs2)

    //b) modify the code
    var xs3:List[Int]=xs2.take(3)
    print(xs3)
  }
}