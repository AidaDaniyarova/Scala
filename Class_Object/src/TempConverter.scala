import scala.io.StdIn.*

object TempConverter {
  var temperature = 50.0
  var currentUnit="Celsius"
  def main(args:Array[String]):Unit={
    print("Enter temperature you want to convert and its unit (F/C) ")
    var temperature:Double = readDouble()
    var currentUnit = readLine()


  }

  def convertToF()={
    if(currentUnit=="Celsius") {
      temperature = temperature * 1.8 + 32
      currentUnit = "Fahrenheit"
    }
    else println("Already in Fahrenheit")
  }

  def convertToC() = {
    if (currentUnit == "Fahrenheit") {
      temperature = (temperature - 32) / 1.8
      currentUnit = "Celsius"
    }
    else println("Already in Celsius")
  }

  def printTemp()={
    println(f"The temperature is $temperature%.2f $currentUnit")
  }
}
