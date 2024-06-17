import scala.io.StdIn.*
case class Employee(name: String, ssid: String, designation: String, salary: Double)

object EmployeeRecordSystem {
  def main(args: Array[String]): Unit = {
    print("Enter the size of the Employee Records: ")
    var size = readInt()
    var employeeRecords = Array[Employee]()
    var row = 0
    var running = true
    var ssid = ""
    var choice = ""
    while (running) {
      println("----Employee Records System----")
      println("Menu: 1. Add Employee Records\t2. Delete Employee Record\n\t  " +
        "3. Search Employee record by SSID\t4. Calculate total salary based on designation\t5. Exit")
      choice = readLine()
      choice match {
        case "1" => println("You choose to add Employee Records");
          while (row < size) {
            var name = readLine()
            var ssid = readLine()
            var designation = readLine()
            var salary = readDouble()
            employeeRecords :+= Employee(name, ssid, designation, salary)
            println("-----------------------------------------------")
            row += 1
          }

        case "2" => ssid = readLine("You choose to delete an Employee Record. Enter the SSID of the employee: ")
          val insize = employeeRecords.size
          employeeRecords = employeeRecords.filterNot(_.ssid == ssid)
          if (employeeRecords.size < insize)
            println("The record is deleted\n")
          else println("No employee found")

        case "3" => ssid = readLine("You choose to search an Employee Record by SSID. Enter the SSID of the employee: ");
          employeeRecords.find(_.ssid == ssid) match {
              case Some(emp) => println(s"Found: ${emp.name}, ${emp.ssid}, ${emp.designation}, ${emp.salary}")
              case None => println("No employee found with given SSID.")
            }

        case "4" => var designation = readLine("You choose to calculate total salary based on designation. Enter designation: ")
            var sum = employeeRecords.filter(_.designation==designation).map(_.salary).sum
            println(s"The total salary is $sum")

        case "5" => System.exit(0)

        case _ => println("Invalid choice, try again!")
          }
      if(running) {
        println("The employees' list: ")
        employeeRecords.foreach(emp => println(s"${emp.name}, ${emp.ssid}, ${emp.designation}, ${emp.salary}"))
      }
      }
    }
  }


