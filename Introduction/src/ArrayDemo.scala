import scala.io.StdIn.*

object ArrayDemo {
    def main(args: Array[String]):Unit={
      /*var myArray = new Array[Int](10)
      var myArr2 = Array[Int](10,20,30,40,50)
      myArray.foreach(println)
      myArray(0)=100
      myArray(1)=200
      myArray(2)=300
      println(myArray(0))

      print("Enter the size of the array")
      var size = readInt()
      var myArr = new Array[Int](size)
      println(s"Enter the $size values")
      var count = 0

      for(i <- 0 until size){ // for i <- 0 to (size-1) do
        myArr(i) = readInt()
      }

      /*while(count<size){
        myArr(count)=readInt()
        count+=1
      }*/

      for item <- myArr do
        println(f"Item value: $item%4d")

      count = 0
      while(count<size){
        println(f"Item value: ${myArr(count)}%4d")
        count+=1
      }*/

      //Methods
      var myArray1 = Array[Int](10,20,30,40,50)
      var myArray2 = Array[Int](38,45,74,69,48)
      var myArray3 = myArray1.concat(myArray2)


      try{
        print(myArray1(20))
      }
      catch{
        case e: ArrayIndexOutOfBoundsException => println("Program generated an error")
      }

      myArray3.foreach(println)

      //Two dimensional array
      println("enter the number os student records")
      var rows= readInt()
      var students =  Array.ofDim[String](rows,4) // 5X4 table, matrix, 5rows, 4 columns
      var i:Int=0
      var j:Int=0
      while(i<rows){
        students(i)(0) =readLine("Enter the Student Name:" )
        students(i)(1) = readLine("Enter the Student Address:")
        students(i)(2) = readLine("Enter the Student Email:")
        students(i)(3) = readLine("Enter the Student Phone:")
        println("--------------------------------")

        i+=1
      }

      for irow <-students do{
        for icol<-irow do{
          println(icol)

        }
        println("-------------------------")
      }
    }
}
