object UseCounter {

  def main(args: Array[String]): Unit = {
    println(Counter.getValue)
    Counter.inc()
    Counter.inc()
    Counter.inc()
    println(Counter.getValue)
    Counter.setValue(5)
    println(Counter.getValue)
    Counter.reset()
    println(Counter.getValue)
  }
}