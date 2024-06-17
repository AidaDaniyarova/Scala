object UseItem {
  //Exercise #5: shopping cart
  def main(args:Array[String]):Unit={
    var item1 = new Item("Apple", 20)
    var productList = List()
    var A: Map[Item, Int] = Map()
    A += (item1 -> 5)
    A.foreach(el => print(s"Name: ${el(0)}, Price: ${el(1)}"))
  }

}
