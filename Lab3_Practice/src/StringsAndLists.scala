object StringsAndLists {
  //Exercise #9: Lists and strings
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little", "lamb")
    var result:String=""
    for(item <- s1){
      result+=item.substring(0,1).toUpperCase()+" "
    }
    print(result)

  }
}