val defaultName = "Nan"
val defaultAge = 0
val defaultPhone = 70000000000L

class Student(protected var name:String, protected var age:Int, protected var phone:Long) {
  //Default constructor

  // Multiple constructors
  //Default values initialization
  def this() ={
  this(defaultName,defaultAge,defaultPhone)
  }

  //Name initialization
  def this(name:String) ={
    this(name,defaultAge,defaultPhone)
    this.name = name // "this" refers to the object
  }

  //Phone initialization
  def this(phone:Long)={
    this(defaultName, defaultAge, phone)
    this.phone=phone
  }
  
  def editStudent(newName:String, newAge:Int, newPhone:Long): Unit ={
    this.name = newName
    this.age = newAge
    this.phone = newPhone
  }

  //Outputting method
  def print():Unit={
    println("Name:" + name)
    println("Age:" + age)
    println("Phone:" + phone)
  }

}
