object MultipleGenerators {
  //Exercise #16: Understanding multiple generators
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5; y <- 1 to 5) {
      println("x: " + x + ", y: " + y)
    }

    println()

    var xs =  for (x <- ('a' to 'e').toList; y <- 'a' to 'e') yield x + "" + y
    println(xs)
  }
}