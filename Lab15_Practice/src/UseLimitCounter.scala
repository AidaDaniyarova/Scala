object UseLimitCounter {
 //Exercise #3: counter4
 def main(args:Array[String]):Unit={
   var counting1 = new LimitCounter()
   var counting2 = new LimitCounter(10,20,11)
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.print()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.inc()
   counting1.print()
   counting2.print()
 }
}
