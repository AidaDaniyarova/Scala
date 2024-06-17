object Students {
  def main(args:Array[String]): Unit ={
    val student1 = new Student("Rose", 21, 71234567898L)
    val student2 = new Student("John", 20, 74859613364L)
    val student3 = new Student("Anonym")
    val student4 = new Student()

    val p2834840 = new ITStudent("Aida",18,74757451862L,"CS","Certificate")
    //However access to the members should the hidden to provide abstraction
    student1.print() //accessing the object methods
    //student1.name = "Sophie" // changing the method of the object
    student1.editStudent("Someone", 22, 75454545454L) //Data abstraction
    p2834840.printITStudent()
    p2834840.print()

    val p123 = new ITStudent()
    p123.printITStudent()
  }
}
