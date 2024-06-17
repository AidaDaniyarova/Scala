object Fibonacci {
  //Exercise #7: Fibonacci sequence
    def main(args: Array[String]): Unit= {
      var fibs= new Array[Int](40)
      fibs(0)=1
      fibs(1)=1
      var i=2
      while(i<40){
        fibs(i)=fibs(i-1)+fibs(i-2)
        i+=1
      }

      println("The first 40 Fibonacci numbers are: ")
      i=0
      while(i<40){
        print(fibs(i)+", ")
        i+=1
      }
    }
}
