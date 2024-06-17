import edu.kz.Connectors.DBConnect

object TestLibrary {

  def main(args:Array[String]):Unit={
    val DBConnection = new DBConnect
    println("Hello it is a jar file")
    for(i <- 0 to 10){
      println(s"Now it is $i")
    }
    
  }
}
