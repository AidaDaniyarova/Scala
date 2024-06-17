class ITStudent(name:String, age:Int, phone:Long, area:String, certifications:String) extends Student(name,age,phone) {

  def this() = {
    this(defaultName,defaultAge,defaultPhone, "CS", "None") //Mario???
  }

  def printITStudent():Unit = {
    println(s"Name: $name, Age: $age, phone: $phone, area: $area, certifications: $certifications")
    super.print()
  }


}
