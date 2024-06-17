import scala.io.StdIn.*

object ModuleMark {
  //Exercise  #11: Module mark calculator
  def main(args: Array[String]): Unit={
    println("Enter you coursework and examination marks percentage (0-100): ")
    var courseMark:Int = readInt()
    var examMark:Int = readInt()
    var result = (courseMark+examMark)*0.5
    
    if(result>=0 && result<=100)
      println(result)
      if(result<40)
        println("You have failed")
        if(courseMark<40 ) println("Resit Coursework")
        else if(examMark<40) println("Resit Examination")
      else println("you have passed")
    else println("Invalid mark percentage")
  }
}
