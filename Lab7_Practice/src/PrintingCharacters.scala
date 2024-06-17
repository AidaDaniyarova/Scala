object PrintingCharacters {
  //Exercise #2: Ranges of characters
  def main(args: Array[String]): Unit = {

    println("Using 'to':")
    for (x <- 'a' to 'e') {
      print(x + " ")
    }

    println("\n\nUsing 'until':")
    for (x <- 'a' until 'e') {
      print(x + " ")
    }

    println("\n\nUsing 'by':")
    for (x <- 'a' to 'z' by 3) {
      print(x + " ")
    }
  }
}