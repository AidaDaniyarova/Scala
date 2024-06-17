import scala.collection.mutable.ListBuffer
import scala.io.StdIn.*


object Magnum {
  def main(args: Array[String]): Unit = {
    var choice: String =""
    var title: String = "=========Magnum SuperMarket======\n===========My Shopping List======\n"
    var menu: String = "Menu: 1. Add Item 2. Delete Item\n\t  3. Clear List 4. Exit\n"
    var shopList: ListBuffer[String] = ListBuffer()
    shopList+="EMPTY"
    var itemCart="\n=====Items Cart====\n\t"
    var itemCartend="\n==================="
    var shopCart:String=""
    for (item <- shopList)
      var shopCart: String =""
    println(title + menu+ shopCart)
    choice= readLine("Enter your choice: ").toLowerCase
    while  (choice != "4" || choice != "exit") {
      for (item <- shopList)
        shopCart += itemCart + item + itemCartend
      println(title + menu + shopCart)
      if choice == "1" || choice == "add item"
      then {
        if (shopList(0) == "EMPTY")
          println("You chosen to add item.")
          shopList(0) = readLine("Enter item you want to add: ")
          println(shopList)
        else
          println("You chosen to add item.")
          shopList += readLine("Enter item you want to add: ")
          println(shopList)
      }
      else if choice == "2" || choice == "delete item"
      then
          println("You chosen to delete item.")
          var itemId: Int = shopList.indexOf(readLine("Enter item you want to delete: "))
          shopList.remove(itemId)
        choice = readLine("Enter your choice: ").toLowerCase
      
    }
  }
}