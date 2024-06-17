object Curry {

  //Exercise #1:
  def add(x: Int)(y: Int): Int = x+y

  def sub(x: Int)(y: Int): Int = x-y

  def mul(x: Int)(y: Int): Int = x*y

  def div(x: Int)(y: Int): Int = x/y

  def mod(x: Int)(y: Int): Int = x%y

  //Exercise #2:
  def eq(c: Char)(d: Char) = c == d

  //Exercise #3:
  def listNum(n: Int)(x: String) = n==x.length

  //Exercise #4:
  def bracket(left: String)(right: String)(whatever: String) = left + whatever + right

  //Exercise #5:
  def lastName(name: String): String = name.split(" ")(1)

  def lt(x: String, y: String): Boolean = lastName(x) < lastName(y)

  def main(args:Array[String]):Unit={
    println((1 to 10) map (add(2)))
    println((1 to 10) map (sub(2)))
    println((1 to 10) map (mul(2)))
    println((1 to 10) map (div(2)))
    println((1 to 10) map (mod(2)))

    println("aardvark".toList filter (eq('a')))

    var fruits = List("apple","pear","banana","peach")
    println(fruits.filter(x => listNum(5)(x)))

    println(fruits map bracket("[")("]"))

    var name = List("Stefan Kuhn","Luke Atwood","Usama Mannai","Stuart O'Connor","Bello Bello")
    println(name.sortWith(lt))
  }

}
