import scala.language.postfixOps

object MoreFuns {
  //Exercise #4: Introducing alternative function definitions

  val incr: Int => Int = x => x+1

  def main(args: Array[String]): Unit = {
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
    
  }
 
}