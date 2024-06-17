class Counter{

  private var value: Int = 0

  def inc(): Unit = {
    value+=1
  }

  def inc(n: Int): Unit = {
    for (i <- 1 to n) inc()
  }

  def getValue: Int = {
    return value
  }

  def setValue(newValue: Int): Unit = {
    this.value = newValue
  }
  
  def reset()={
    this.value = 0
  }
}