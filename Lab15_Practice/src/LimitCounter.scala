val deflowerLimit:Int = 0
val defupperLimit:Int = 10
val defcounter:Int = 0

class LimitCounter(var lowerLimit:Int, var upperLimit:Int, var counter:Int) {

  def this()={
    this(deflowerLimit,defupperLimit,defcounter)
  }

  def reset(lo: Int, up: Int) = {
    this.lowerLimit = lo
    this.upperLimit = up
    this.counter = lo
  }

  def setLowerLimit(lo: Int) = {
    if(this.counter < lo) this.counter = lo
  }

  def setUpperLimit(up: Int) = {
    if (this.counter > up) this.counter = up
  }
  
  def setToLowerLimit() = {
    this.counter = this.lowerLimit
  }
  
  def setToUpperLimit() = {
    this.counter = this.upperLimit
  }
  
  def inc() = {
    if(this.counter < this.upperLimit){
      this.counter += 1
    }
    else setToLowerLimit()
  }

  
  def dec() = {
    if (this.counter > this.lowerLimit) {
      this.counter -= 1
    }
    else setToUpperLimit()
  }
  
  def getLowerLimit: Int = {
    return this.lowerLimit
  }
  
  def getUpperLimit: Int = {
    return this.upperLimit
  }
  
  def getValue: Int = {
    return this.counter
  }
  
  def isAtLowerLimit: Boolean = {
    if(this.counter == this.lowerLimit) true else false
  }
  
  def isAtUpperLimit: Boolean = {
    if (this.counter == this.upperLimit) true else false
  }

  def print(): Unit = {
    println("Lower Limit:" + lowerLimit)
    println("Upper Limit:" + upperLimit)
    println("Counter:" + counter)
  }
}
