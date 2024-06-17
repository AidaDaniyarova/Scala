object MultipleArgs {
//Exercise #1: Extending to multi-parameter functions
  def largerOf(c: Int, d: Int): Int = if (c>d) c else d

  def smallerOf(c: Int, d: Int): Int = if (c>d) d else c

  //Exercise #2: More multi-parameter functions

  def smallerOf3(c: Int, d: Int, e:Int): Int = if (((c>d) && (d>e)) || ((d>c) && (c>e))) e else if(((d>e) && (e>c)) || ((e>d) && (d>c))) c else d

  def medianOf3(c: Int, d: Int, e:Int): Int = if (((c>d) && (d>e)) || ((e>d) && (d>c))) d else if(((d>e) && (e>c)) || ((c>e) && (e>d))) e else c

  //Exercise #3: Complex multi-parameter functions

  def gcd(a: Int, b: Int): Int = {
    var x = a
    var y = b
    while(x==y){
      while(x<y){
        y-=x
      }

      while(y<x){
        x-=y
      }
    }
    return x
  }

  def main(args: Array[String]): Unit = {

    for(a <- 1 to 3; b <- 1 to 3)
      println(s"Larger of $a and $b is ${largerOf(a,b)}")

    for (a <- 1 to 3; b <- 1 to 3)
      println(s"Smaller of $a and $b is ${smallerOf(a, b)}")

    for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
      println(s"Smaller of $a, $b and $c is ${smallerOf3(a, b, c)}")

    for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
      println(s"Median of $a, $b and $c is ${medianOf3(a, b, c)}")

    println(gcd(36,12))
  }
}