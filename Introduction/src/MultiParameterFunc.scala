object MultiParameterFunc {

  def largerOf(c:Int, d:Int): Int = if(c>d) c else d

  def highestOfThree(x:Int, y:Int, z:Int): String =
    {
      if(x>y && x>z || (x==y && x>z) || (x==z && x>y)) return x.toString
      else if(y>x && y>z || (x==y && y>z) || (y==z && y>x)) return y.toString
      else if(z>x && z>y || (z==x && z>y) || (z==y && z>x)) return z.toString
      else return "equal"
    }

  def arrayLargerLength(a:Array[Any], b:Array[Any]): String=
    {
      if(a.length > b.length) return s"arr1 has larger length"
      else if(b.length > a.length) return s"arr2 has larger length"
      else return "Both has equal length"
    }

  def main(args: Array[String]): Unit = {
    println(largerOf(5,10))
    for (a <- 1 to 3; b <- 1 to 3)
      println(s"Larger of $a and $b is ${largerOf(a, b)}")

    for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
      println(s"Larger of $a and $b and $c is ${highestOfThree(a, b, c)}")

    var arr1 = Array[Any](1,2,5,8)
    var arr2 = Array[Any]("ds","us", "jdsjwe","dkhr")
    println(s"Larger of arr1 and arr2 is ${arrayLargerLength(arr1,arr2)}")

  }
}
