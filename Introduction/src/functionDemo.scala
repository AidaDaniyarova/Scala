object functionDemo {
  def main(args: Array[String]): Unit ={
    var res=add(65.21,875.22)
    print(res)

    val calcObject = new Calculator() // Memory allocation for object = new
    var res1=calcObject.sub(123.5,58.1)
    displayInfo()
    var output = displayInfo2()
    println(s"The output is $output")

    val anonymous: (Int, Int) => Int = (a,b) => a+b //Accepts two element, but can return only one value
    println(anonymous(30,40))

    multipleReturnFunc(15, "John").foreach(println)
    var newArray = multipleReturnFunc(15, "John")
    var newInt:Int = newArray(0).toString.toInt
    var newString:String = newArray(1).toString
    println(s"$newInt, $newString")

    println((1 to 10).map(_+1))
  }
  def add(a:Double, b:Double): Double = {
    var result = a+b
    result // or return result
  }


  class Calculator{
    def sub(a: Double, b: Double): Double = {
      var result = a - b
      result
    }
  }

  def displayInfo():Unit={
    var a:Float = 324.32
    var b:Float = 234.23
    var result = a+b
    println(s"The result is $result")
  }

  def displayInfo2(): Float = {
    var a: Float = 324.32  //Not accessible outside the function block because the scope is within the function
    var b: Float = 234.23
    var result = a + b
    return result
  }

  //Multiple returns can be done using collection
  def multipleReturnFunc(x:Int, y:String): Array[Any]={
    var newX = x+100
    var newY = "Hello " + y
    var myArray = Array[Any](newX,newY)
    return myArray
  }



}
