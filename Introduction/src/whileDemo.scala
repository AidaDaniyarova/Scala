import scala.io.StdIn.*
import scala.math.{Pi, rint}

object whileDemo {
  def main(args: Array[String]): Unit = {
    //Generate and display the area of circle with radius 1-100
    //area of circle = pi * radius * radius
    /*var radius = 1
    while(radius<=100){
      var area = math.Pi * radius * radius
      println(f"$area%8.2f")
      radius+=1
    }
    radius=1
    var exitFlag:Boolean =false
    while(!exitFlag){
      var area = math.Pi * radius * radius
      println(f"The area of the cicle of the radius $radius is $area%.2f")
      radius+=1
      println("Do you wish to continue (Y/N)")
      var input = readChar()
      exitFlag={
        if(input=='Y' || input=='y') then false
        else true
      }
    }*/


    val numArray:Array[Int] = Array(10,20,30,40,50)
    var index=0

    /*while(index<numArray.length){
      var area = math.Pi * numArray(index) * numArray(index)
      println(f"The area of the radius ${numArray(index)} is $area%.2f")
      index+=1
    }*/

    //For loop
   var i = 1
    var area:Double = 0
    for i <- numArray
      do
        area = math.Pi * i * i
        println(f"The area of the radius $i is $area%.2f")

    i=1
    while {
      var area = math.Pi * i * i
      println(f"The area of the radius $i is $area%.2f")
      i+=1
      (i<10)
    } do()

    var row: Int = 1
    var height =readInt
    var width=readInt()
    while (row <= height) {
      var col: Int = 1
      while (col <= width) {
        print("*")
        col += 1
      }
      println()
      row += 1
    }

  }
}
