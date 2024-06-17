object FlatMap {
  //Exercise #17: Flattening data structures
  def main(args: Array[String]): Unit = {
    var xs = List("apple","pear","banana", "kiwi")

    //similar to flatten
    var chars = for (x <- xs; y <- x) yield y
    println(chars)

    //similar to flatMap
    chars = for (x <- xs; y <- x.take(3)) yield y
    println(chars)


    //similar to flatMap followed by map
    chars = for (x <- xs; y <- x.take(3)) yield y.toUpper
    println(chars)

    var nums = List(List(1,2,3),List(4,5,6),List(7,8,9))
    var flatten = for(x <- nums; y<- x) yield  y
    println(flatten)
    var flatmap = for(x <- nums; y<- x.take(2)) yield  y
    println(flatmap)
  }
}