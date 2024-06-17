import TrafficLight.switchLight

object CodeFunc {




  def main(args:Array[String]):Unit={
    UsingFunc.counter = 10
    println(UsingFunc.inc()) //Not working because the UsingFunc object is not running
                            // and object variables are also not created

    UsingFunc.printHi() //UsingFunc is running creating object variables
    UsingFunc.inc()
    UsingFunc.printHi()


    TempConverter.printTemp()
    TempConverter.convertToF()
    TempConverter.printTemp()
    TempConverter.convertToF()
    TempConverter.printTemp()
    TempConverter.convertToC()
    TempConverter.convertToC()
    TempConverter.printTemp()
    TempConverter.convertToF()
    TempConverter.printTemp()
  }
  def inc(x:Int):Int = x+1
}
