import scala.collection.mutable.ArrayBuffer

//Assign class of objects
class Tasks(var taskName:String="Task0", var id:Int = 100, var status:Boolean=false)

object classDemo {
def main(args:Array[String]):Unit={
  var manyTasks = ArrayBuffer[Tasks]( //Array of objects with assigned values
    Tasks("Task1",101,true),
    Tasks("Task2",102,false),
    Tasks("Task3", 103,false)
  )
  manyTasks+=Tasks() //adding new row of information to the Array
  //Outputting the information
  for (i <-manyTasks){
    println(s"Name: ${i.taskName}, Id: ${i.id}, Status: ${i.status}")
  }

  //Without class
  var mapTask = ArrayBuffer[Map[String,String]]()
  mapTask+=Map("name"->"Task1", "ID"->"101", "Status"-> "false")
  mapTask+=Map("name"->"Task2", "ID"->"102", "Status"-> "true")

  //Outputting
  var i=1
  for(tasks <- mapTask)
    {
      println(s"Object $i: ")
      println(s"Name: ${tasks("name")}, ID: ${tasks("ID")}, Status: ${tasks("Status")}")
      i+=1
    }
}
}
