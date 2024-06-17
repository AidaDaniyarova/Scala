import scala.util.Random
import scala.io.StdIn._

object HighLow {
  //Exercise #10: Combining while and if statements
  def main(args: Array[String]): Unit = {
    var secret: Int = new Random().nextInt(51)
    println(secret)
    print("Guess\n\t  ?  ")
    var num:Int = readInt()
    var count:Int = 0
    var running:Boolean = true
    while(running){

      if(num<secret){
        print("Higher\n\t  ?  ")
        num=readInt()
        count+=1
      }
      else if(num>secret){
        print("Lower\n\t  ?  ")
        num=readInt()
        count+=1
      }
      else{
        println(s"Correct - this took you $count guesses.")
        running = false
      }

    }

  }
}
