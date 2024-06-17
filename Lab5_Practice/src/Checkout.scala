import scala.io.StdIn.*

object Checkout {
  //Exercise #7: Producing a checkout receipt
  def main(args: Array[String]): Unit = {
    var xs: List[Float] = List()
    var num:Float = 1.00
    while (num != 0) {
      print("Price?\t")
      num = readFloat()
      xs = xs :+ num
    }
println("\t  ------")
    println(f"Total:\t${xs.sum}%.2f\t(${xs.length-1} items)")
  }
}
