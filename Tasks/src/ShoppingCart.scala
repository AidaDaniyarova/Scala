import scala.io.StdIn.*
import scala.collection.mutable.ListBuffer

object ShoppingCart {
  def main(args: Array[String]): Unit = {
      val shoppingCart: ListBuffer[String] = ListBuffer()
      var running = true
      while (running) {
        println("=========Magnum SuperMarket======\n===========My Shopping List======")
        println("Menu: 1. Add Item 2. Delete Item\n\t  3. Clear List 4. Exit\n")

        if (running) {
          if (shoppingCart.isEmpty) {
            println("=====Items Cart====\n\tEMPTY")
          } else {
            println("=====Items Cart====")
            shoppingCart.foreach { case (name) => println(s"$name")
            }
          }
          println("===================")
        }
        val choice = readLine("Enter Your choice (number): ")
        choice match {
          case "1" =>
            print("Enter item name: ")
            val name = readLine()
            shoppingCart += ((name)) // Adding a tuple to ListBuffer
            println(s"\n$name is added to the cart.\n")

          case "2" =>
            print("Enter item name to delete: ")
            val name = readLine()
            val initialSize = shoppingCart.size
            shoppingCart --= shoppingCart.filter(_ == name) // Remove items by filtering
            if (shoppingCart.size < initialSize) {
              println(s"\n$name is removed from the cart.\n")
            } else {
              println(s"\n$name is not found in the cart.\n")
            }

          case "3" =>
            shoppingCart.clear() // Clear the ListBuffer
            println("\nCart cleared.\n")

          case "4" =>
            running = false

          case _ =>
            println("Invalid option. Please try again.\n")
        }
      }
  }
}
