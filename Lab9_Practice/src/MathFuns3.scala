object MathFuns3 {
  //Exercise #5: Introducing anonymous functions
  val incr: Int => Int = x => x+1

  val decr: Int => Int = x => x-1

  val sqr: Int => Int = x => x*x

  val dbl: Int => Int = x => x*2

  def main(args: Array[String]): Unit = {
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)

    // a)
    println(decr(5))
    println((1 to 10) map decr)
    println((1 to 10) map decr map decr)

    //b)
    println(sqr(5))
    println((1 to 10) map sqr)
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map incr)

    //c)
    println(dbl(5))
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map dbl map incr)
    println((1 to 10) map sqr map incr map dbl)

    //5
    println((1 to 10) map (x => x+1))
    println((1 to 10) map (x => x + 10 + 3))
    println((1 to 10) map (x => x + 10 + 3) filter (n => n % 3 == 0))

  }
}