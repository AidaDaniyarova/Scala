object MoreFuncs {
  //Exercise #4: Introducing alternative function definitions

  val incr: Int => Int = x => x+1

  val decr: Int => Int = x => x-1

  val sqr: Int => Int = x => x*x

  val dbl: Int => Int = x => x*2

  val even: Int => Boolean = x => x%2==0

  val odd: Int => Boolean = x => x%2!=0

  val inv: Boolean => Boolean = x => !x

  val negative: Int => Boolean = x => x<0

  val pal: String => Boolean = x => x==x.reverse

  val strlen: String => Int = x => x.length

  val bracket: String => String = x => "[" + x + "]"

  def main(args: Array[String]): Unit = {
    //1
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)

    // a)2
    println(decr(5))
    println((1 to 10) map decr)
    println((1 to 10) map decr map decr)

    //b)2
    println(sqr(5))
    println((1 to 10) map sqr)
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map incr)

    //c)2
    println(dbl(5))
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map dbl map incr)
    println((1 to 10) map sqr map incr map dbl)

    //a)3
    println(even(5))
    println(even(6))
    println((1 to 10) map even)
    println((1 to 10) filter even)
    println((1 to 10) filter even map sqr)

    //i
    println(odd(5))
    println(odd(6))
    println((1 to 10) map odd)
    println((1 to 10) filter odd)
    println((1 to 10) filter odd map sqr)

    //ii
    println(inv(true))
    println(inv(false))

    //iii
    println(negative(5))
    println(negative(-6))
    println((-5 to 5) map negative)
    println((-5 to 5) filter negative)
    println((-5 to 5) filter negative map sqr)

    //iv
    var palList = List("pop", "foo", "bar", "pip")
    println((palList) map pal)
    println((palList) filter pal)

    //v
    println(strlen("hello"))
    println(strlen("hi"))

    //vi
    println(bracket("red"))
    println(bracket("pink"))

  }
}