import scala.collection.mutable.ListBuffer
import scala.io.StdIn.*
import scala.math.sqrt

object SecondScalaCode {
  def main(args: Array[String]): Unit = {
    val name = readLine("Enter your Name:")
    println("Welcome " + name.trim.toUpperCase)
    println(name.trim)
    //println(name.charAt(2))
    var uni:String = "    DMUK   "
    uni=uni.trim.concat(" is located in Almaty")
    println(uni)

    if (uni.contains("Almaty"))
        println("Yes, it is")

    var newString = uni.substring(8, 15)
    println(newString)

    var words:Array[String] = uni.split(" ")
    println(words(0))
    println(words(1))

    var myShoppingList = ListBuffer[String]()
    myShoppingList.addOne("Bread")
    myShoppingList.addOne("Milk")
    myShoppingList+=("Flour","Hello","Oil")
    myShoppingList.append("Tea with milk")
    println(myShoppingList)
    myShoppingList.remove(3)
    myShoppingList.foreach(println)
    myShoppingList(3)="New item"
    println(myShoppingList)

    var i =1
    for(items <- myShoppingList){
      println("The " + i + " item is " + items)
      i+=1
    }


    //Lists
    var myList = List("Dmuk", 123)
    var myArray = Array("hfhhf", 5)
    var myLists = List("Dmuk", (10,20,30),("ABC", "DEF"), 78, 5)
    if(myList.isEmpty)
        println("list is empty")
    else
      println(myList)
    //if, else, nested if
    print("Enter your mark: ")
    val marks=readInt()
    if(marks>=0 && marks<=39)
      println("You have failed")

    else if(marks>=40 && marks<=100)
      println("You have passed")
      if(marks<=59) println("Second class")
      else if(marks<=79) println("First class")
      else println("Designation class")
    else println("Invalid value")
    //Blocks
    var x=10
    var x0=5
    var y=20
    var y0=10
    val distance:Double ={
      val dx=x-x0
      val dy = y-y0
      sqrt(dx*dx+dy*dy)
    }
    println(distance)

  }
}
