object UseCounter {
  //Exercise #2: counter3
  def main(args: Array[String]): Unit = {
    var counter1: Counter = new Counter()
    var counterExp = new Counter()

    println("counter 1: "+counter1.getValue)
    counter1.inc()
    println("counter 1: "+counter1.getValue)
    counter1.inc(5)
    println("counter 1: "+counter1.getValue)
    counter1.setValue(50)
    println("counter 1: "+counter1.getValue)
    counter1.reset()
    println("counter 1: "+counter1.getValue)

    println("counterExp: "+counterExp.getValue)
    counterExp.inc()
    counterExp.inc()
    counterExp.inc()
    println("counterExp: "+counterExp.getValue)
  }
}