object UsingFunc {

  var counter:Int = 0 //object variable has an object scope (Entire object)
  def inc():Unit = counter+=1

  def printHi():Unit={
    println(s"Hello, Hi $counter")
  }
  
  def main(args:Array[String]):Unit={
    println(CodeFunc.inc(10)) //Calling the func using object

    var a:Int =100 // local variable

    inc() //Incrementing the counter
    inc()
    inc()
    
    
  }
}
