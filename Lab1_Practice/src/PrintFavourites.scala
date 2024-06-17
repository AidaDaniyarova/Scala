object PrintFavourites {
  //Exercise #7: Outputting numbers and chars
  //a)Output the code
  def main(args: Array[String]): Unit = {
    print("My favourite whole number is: ")
    println(20)
    print(" and decimal number is: ")
    println(0.5)
    print(" and letter is: ")
    println('t')

    //b) Rewrrite with single println using concatenation
    println("My favourite whole number is: " + 20+ " and decimal number is: "+0.5+" and letter is: "+'t')
  }
}