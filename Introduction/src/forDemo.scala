import scala.io.StdIn.*


object forDemo {
  def main(args: Array[String]): Unit ={
    //For loop with a generator ~ variable <- expression
    /*for(i <- 1 to 10) { // to includes 10
      println(i)
    }

    for (i <- 1 until 10) { // until excludes 10
      println(i)
    }

    for (i <- 'a' to 'z') { // Also possible for char
      println(i)
    }

    for (i <- 1 to 10 by 2) { // Step size can be modified
      println(i)
    }

    for (i <- 10 to 1 by -1) { // Reversed order, step size should be negative
      println(i)
    }

    var x=2
    for (i <- 1 to 10 by x*2) { // Step size can be an expression
      println(i)
    }

    var myArray = Array[Int](10,20,30,40,50,60,70,80)
    for(i <- 0 until myArray.length){ // Can be replaced by myArray.indices
      println(myArray(i))
    }

    for(i <- myArray){  // Easier way
      println(i)
    }

    for (i <- myArray.length-1 to 0 by -1) { // Reversed order array, which is not possible for the previous one
      println(myArray(i))
    }

    var i = 0
    while(i<myArray.length){ // while loop is complicated than for
      println(myArray(i))
      i+=1
    }

    //Processing string
    var message = readLine()
    for(letter <- message){
      println(letter)
    }

    //Filtering using guards
    var myArrayfilt = Array[Int](815,8150,84,584,8594,578,150)
    for(i <- myArrayfilt if i%5==0){
      println(i)
    }

    for (letter <- message if letter.isUpper) {
      println(letter)
    }

    for (letter <- message) { // Filtering imperatively
      if (letter.isUpper) {
        println(letter)
      }
    }

    var array5 = for(i <- myArrayfilt if i%5==0) yield i
    myArrayfilt.foreach(el => print(s" $el "))
    println()
    array5.foreach(el => print(s" $el "))
    println()
    var array55 = for(i <- myArrayfilt) yield if i%5==0 then i else '-'
    array55.foreach(el => print(s" $el "))
    println()

    //Multidimensional array with for expression
    var rows =readInt()
    var students =  Array.ofDim[String](rows,4)
    i=0

    while (i < rows) {
      students(i)(0) = readLine("Enter the Student Name:")
      students(i)(1) = readLine("Enter the Student Address:")
      students(i)(2) = readLine("Enter the Student Email:")
      students(i)(3) = readLine("Enter the Student Phone:")
      println("--------------------------------")

      i += 1
    }

    for(row<-students){
      for (col <- row) {
        println(col)
      }
      println("-------------------")
    }

    for(row<-students;col<-row){
      println(col)
    }*/

    var xs = List("apple", "pear", "banana", "kiwi")

    //similar to flatten
    var chars = for (x <- xs; y <- x) yield y
    println(chars)
    //similar to flatMap
    chars = for (x <- xs; y <- x.take(3)) yield y
    println(chars)
    var rows=readInt()
    var cols=readInt()
    var table = Array.ofDim[Int](rows, cols)

    for (i <- 0 until rows; j <- 0 until cols) {
      table(i)(j) = (i + 1) * (j + 1)
    }

    for (i <- 0 until rows; j <- 0 until cols) {
      print(f"${table(i)(j)}%4d")
      if (j == cols - 1) println()
    }
    for (row <- table) {
      for (col <- row) {
        print(f"$col%4d")
      }
      println()
    }

    var table1: Array[Array[Int]] = 
      for (i <- (1 to rows).toArray) yield
        for (j <- (1 to cols).toArray) yield i * j
    


  }
}
