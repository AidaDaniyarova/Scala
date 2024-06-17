object TrafficLight {
  var currentLight = "Yellow"
  def main(args:Array[String]):Unit={
    switchLight()
    println(currentLight)
    switchLight()
    println(currentLight)
    switchLight()
    println(currentLight)
    switchLight()
    println(currentLight)
  }

  def switchLight() ={
    if(currentLight=="Green"){
      currentLight = "Yellow"
    }else
    if (currentLight == "Yellow") {
      currentLight = "Red"
    }else
    if (currentLight == "Red") {
      currentLight = "Green"
    }
  }

}
