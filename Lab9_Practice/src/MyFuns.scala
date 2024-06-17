import scala.language.postfixOps

object MathFuns {
  //Exercise #3: Introducing different types

  def incr(x: Int): Int = x+1

  def decr(x: Int): Int = x-1

  def sqr(x: Int): Int = x*x

  def dbl(x: Int): Int = x*2

  def even(x: Int): Boolean = x%2==0

  def odd(x: Int): Boolean = x%2!=0
  def oddL(x: Long): Boolean = x%2!=0

  def inv(x: Boolean): Boolean = !x

  def negative(x: Int): Boolean = x<0

  def pal(x: String): Boolean = x==x.reverse

  def strlen(x: String): Int = x.length

  def bracket(x: String): String = "[" + x + "]"
 //Exercise #6: Divisors
  def countDivisors(n: Int): Int = {
    var d: Int = 0
    for (k <- 1 until n)
      if (n % k == 0)
        d = d + 1
    d
  }

  def countDivisorsShort(n: Int): Int = (1 until n) filter (k => n%k==0) length


  //Advanced functions #1: Prime
  def prime(x: Long): Boolean =  (x==2) || (x>1) && (x%2==1) && ((3 to Math.sqrt(x).toInt) forall (x % _ != 0))

  def findDivisors(n: Long): Int = {
    var d: Int = 0
    var listD = List[Int]()
    for (k <- 1 until n.toInt)
      if (n % k == 0)
        listD=listD.appended(k)
    listD.sum
  }
  //Advanced functions #2: Perfect
  def perfect(x:Long):Boolean = if (findDivisors(x)==x) true else false

  //Advanced functions #3: Digit-to-word
  def digitToWord(x:Int):String = {
    x match{
      case 0=> "Zero"
      case 1=> "One"
      case 2=> "Two"
      case 3=> "Three"
      case 4=> "Four"
      case 5=> "Five"
      case 6=> "Six"
      case 7=> "Seven"
      case 8=> "Eight"
      case 9=> "Nine"
      case _ => "Bad digit"
    }
  }

  def wordToDigit(x:String):Int={
    x match {
      case "Zero" =>0
      case "One" => 1
      case "Two" => 2
      case "Three" => 3
      case "Four" => 4
      case "Five" => 5
      case "Six" => 6
      case "Seven" => 7
      case "Eight" => 8
      case "Nine" => 9
      case _ => -1
    }
  }

  def leapYear(x:Int):Boolean={
    if(x%400==0) true
    else if(x%100==0) false
    else if(x%4==0) true
    else false
  }


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

    //6
    println(countDivisors(120))
    println(countDivisorsShort(120))

    //Challenge 1
    println(prime(23))

    //Challenge 2
    println(perfect(28))

    //Challange 3

  }
}