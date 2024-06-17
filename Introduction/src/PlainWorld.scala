object PlainWorld {
  def main(args:Array[String]): Unit ={
    //println(3*"DMUK") println("Hi"*"DMUK") println("Hi"*2.5) will not work
    println("DMUK"*3)
    println(("ho"*2).toUpperCase())
    var x = List(1, 2, 3, 4, 5)
    println(x.take(7).takeRight(2).reverse)
    println(7/2)
    println("2\"be\"or\\2be" + "\\")
    println("result is " + 10 * 10)
    println("aardvark".substring(3).substring(1,3))
    println(x.tail)
    var s: String = "fred"
    println(s.charAt(s.indexOf("f")+1))
    var pi: Double = 3.14159265
    print(f"${pi}%05.2f")
    var a  = 60L
  }
}
