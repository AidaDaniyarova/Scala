object MathFuns5 {

  def add(x: Int, y: Int): Option[Int] = {
    if ((x<0 && y>0) || (x>0 && y<0) || x==0 || y==0)
      // if x and y have different signs or x or y equal zero then cannot overflow
      Some(x+y)      // therefore safe to add
    else if (x>0) {
      // both x and y must be greater than zero and overflow could occur
      if (Int.MaxValue - x >= y)
        Some(x+y)   // it is safe to add
      else
        None        // overflow would occur
    }
    else {
      // both x and y must be less than zero and underflow could occur
      if (Int.MinValue - x <= y)
        Some(x+y)   // it is safe to add
      else
        None        // underflow would occur
    }
  }

  def analyseAdd(x: Int, y: Int): Unit = {
    add(x, y) match {
      case Some(n) => println(s"Adding $x to $y produces $n")
      case None    => println(s"Adding $x to $y causes under/overflow")
    }
  }

  def main(args: Array[String]): Unit = {
    val big: Int = 2147483647
    val small: Int = -2147483648
    val mid0: Int = 46340
    val mid1: Int = 46341

    analyseAdd(small,small)
    analyseAdd(small,-1)
    analyseAdd(small,big)
    analyseAdd(big,big)
    analyseAdd(big,1)
    analyseAdd(big,small)
  }
}