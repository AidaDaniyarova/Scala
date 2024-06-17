val defName = "Name"
val defPrice:Int = 0

class Item(var name:String, var price:Int) {

  def this() = {
    this(defName, defPrice)
  }

  def setNewValue(name:String, price:Int)={
    this.name = name
    this.price = price
  }
}
