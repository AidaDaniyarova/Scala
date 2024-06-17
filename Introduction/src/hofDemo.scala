import scala.math.*

object hofDemo {
  def main(args: Array[String]): Unit = {
    /*//Anonymous function
    def intDecorator(x: Int, func: Int => String /*lambda expression*/) = func(x)
    var result = intDecorator(10,(y:Int)=> "{"+y+"}") //Using anonymous functions
    println(result)

    //Without anonymous function
    def decorate(a:Int):String={
      return "[" + a + "]"
    }
    var result2=intDecorator(10, decorate)
    println(result2)

    //HOF returning function
    def greetSomeone(prefix:String)={
      println("Got a prefix " + prefix)
      (name:String)=> println(prefix+" "+name)
    }
    val returnFunc =greetSomeone("Welcome")
    returnFunc("DMUK Students")

    def func(x:Int)={
      println(sqrt(x))
      (y:Int)=> println(sqrt(x+y))
    }
    val function=func(9) // Returning  function
    function(7) //Running a returned function*/

    //Foreach method
    val numArray = Array[Int](10,20,30,40,50,60,70,80)
    numArray.foreach(num => println(s"Square of $num is ${num*num}")) //Using anonymous func

    println("-----------------")
    // Using regular function
    def processArray(a:Int):Unit={
      println(s"Square of $a is ${a*a}")
    }
    numArray.foreach(processArray)
    //Multidimensional
    val studArr = Array[Array[String]](Array("101","John","CS"),Array("102","Robert","Business"))
    studArr.foreach(elem => {
      print(s"Student details are: ")
      elem.foreach(elem2 => print(elem2 + " "))
      println()
    })

    //Filter method
    val numArrays = Array[Int](10,20,30,40,50,60,70,80)
    numArrays.filter(item => item>=40).foreach(println) // for 1-dimensional array
    for(item <- numArrays){
      if(item>=40){
        println(item)
      }

    }

    //Creating new filtered collection
    var fruits = List("apple", "banana", "pear", "grape", "kiwi")
    var filterFruits = fruits.filter(ele => ele.length>4)
    println(filterFruits)
    fruits.filter(x => !x.startsWith("b")).foreach(println)
    //Shorthand notation
    fruits.filter(!_.startsWith("b")).foreach(println)


    def square(a:Int): Int={
      a*a
    }

    var nums = Array[Int](10,53,42,53,8,7,16,18,21,65)
    nums.filter(_<20).foreach(elem => println(s"Square of $elem is ${square(elem)}"))

    "Some kind of sentence".filter(_.isLetter).foreach(x => print(x.toUpper + "-"))

    //Multidimensional array
    val studArray = Array[Array[String]](Array("101","John","CS"),Array("102","Robert","Business"))


    //Map
    nums.filter(_<20).map(x=>x*x).foreach(elem => println(s"Square of ${sqrt(elem).toInt} is $elem"))
    var newArray = nums.map(x=>x*x)


    //FlatMap
    var words = List("apple", "banana", "pear", "grape", "kiwi")

    //a list of strings is converted into a list of characters
    var letters: List[Char] = words.flatMap(x => x)
    println(letters)
    println(words.flatten) //alternative to simply flatten

    //example of mapping input value prior to flattening
    println(words.flatMap(x => x.take(3)))

    //map each input value into a collection, then flatten
    var nums2 = List(1, 2, 3, 4, 5, 6)
    println(nums2.flatMap(x => List(x, x + 1)))

    //chaining higher order functions (nums is List[List[Int]])
    //nums2.flatMap(x => x.dropRight(1)).map(x => x * 2).filter(x => x > 5).foreach(x => print(x + " "))

  }
}
