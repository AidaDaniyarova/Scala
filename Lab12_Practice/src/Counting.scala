object Counting {
  //Exercise #1: countdown
  def countdown(n: Int): Unit = {
    print(s"$n ")
    if (n == 0)
      println("Stopped")
    else
      countdown(n - 1)
  }

  def countTo10(n: Int): Unit = {
    if(n < 11) {
      print(s"$n ")
      if (n == 10)
        println("Stopped")
      else
        countTo10(n + 1)
    }
    else return println("Out of range number")
  }

  //Exercise #2: countToN
  def countToN(a:Int, b:Int):Unit={
    if (a < b+1) {
      print(s"$a ")
      if (a == b)
        println("Stopped")
      else
        countToN(a + 1,b)
    }
    else return println("First should be less than second")
  }

  //Exercise #3: reverseCountToN
  def reverseCountToN(a:Int, b:Int):Unit={
    if (a > b-1) {
      print(s"$a ")
      if (b == a)
        println("Stopped")
      else
        reverseCountToN(a-1, b)
    }
    else return println("Second should be less than first")
  }

  //Exercise #4: factorial
  def factorial(n: Long): Long = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }

  //Exercise #5: SumFromTo
  def SumFromTo(a: Int, b: Int): Int ={
    if(a<b+1) {
      if (a == b) {
        a
      } else {
        a + SumFromTo(a + 1, b)
      }
    }
    else return 0
  }

  //Exercise #6: sumList
  def sumList(xs: List[Int]): Int =
    if (xs.isEmpty) 0
    else xs.head + sumList(xs.tail)

  def prodList(xs: List[Int]):Int =
    if(xs.isEmpty) 1
    else xs.head * prodList((xs.tail))

  def lenList(xs: List[Int]): Int =
    if (xs.isEmpty)
      0
    else
      1 + lenList(xs.tail)

  def allTrue(xs: List[Boolean]): Boolean =
    if (xs.isEmpty)
      true
    else
      xs.head && allTrue(xs.tail)

  def anyTrue(xs: List[Boolean]): Boolean =
    if (xs.isEmpty)
      false
    else
      xs.head || anyTrue(xs.tail)

  def fibonacci(n: BigInt): BigInt =
    if (n == 0) 0
    else if (n == 1) 1
    else fib(0, 1, n - 2)

  def fib(a: BigInt, b: BigInt, n: BigInt): BigInt =
    if (n == 0) a + b
    else fib(b, a + b, n - 1)


  //Challenge #1: Fibo
  def fibo(n: BigInt): BigInt ={
    if(n!=1) n * fibo(n-1)
    else return n
  }

  //Challenge #2: qsort
  def qsort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) xs
    else {
      val lesser = xs.tail.filter(_ <= xs.head)
      val greater = xs.tail.filter(_ > xs.head)
      qsort(lesser) ++ (xs.head :: qsort(greater))
    }

  //Challenge #3: Ackermann
  def ackermann(n:Int, m:Int):Int={
    if(n==0) return m+1
    else if(m==0) return ackermann(n-1,1)
    ackermann(n-1,ackermann(n,m-1))
  }

  def main(args:Array[String]):Unit= {
    countdown(20)
    countTo10(1)
    countToN(15, 20)
    reverseCountToN(27, 16)
    println(factorial(21)) //Out of range of type Long
    println(factorial(6))

    println(SumFromTo(5, 4))
    println(SumFromTo(7, 7))
    println(SumFromTo(2, 5))

    println(sumList(List()))
    println(sumList(List(1)))
    println(sumList(List(2, 4, 7, 9)))
    println(sumList((1 to 20).toList))


    println("\nTesting factorial works...")
    println("fac(5) " + factorial(5))
    //println("fac(-1) " + factorial(-1))
    //println("fac(21) " + factorial(21))
    println("Max long value? " + Long.MaxValue)

    println("\nTesting prodList works...")
    println(prodList(List(2, 3, 4)))

    println("\nTesting lenList works...")
    println(lenList(List(2, 3, 4)))

    println("\nTesting allTrue works...")
    println(allTrue(List(true, true, true)))
    println(allTrue(List(true, false, true)))

    println("\nTesting anyTrue works...")
    println(anyTrue(List(false, false, false)))
    println(anyTrue(List(false, true, false)))
    println(fibonacci(7))
    println(fibo(5))

    var t0 = System.nanoTime()
    var fib32 = fibonacci(32)
    var t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1 - t0}ns")
    t0 = System.nanoTime()
    fib32 = fibo(32)
    t1 = System.nanoTime()
    println(s"Fib(32) = $fib32. Took ${t1 - t0}ns")

    println(qsort(List(1, 5, 7, 11, 5, 15)))

    println(ackermann(1, 2))
  }
}
