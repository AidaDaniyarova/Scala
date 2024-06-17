object Counter {

  private var counter: Int = 0

  def getValue: Int = counter

  def inc(): Unit = {
    counter = counter + 1
  }

  def inc(n: Int): Unit = {
    for (i <- 1 to n) inc()
  }

  def setValue(newValue: Int) = counter=newValue

  def reset() = counter=0 // reset the counter to zero
}