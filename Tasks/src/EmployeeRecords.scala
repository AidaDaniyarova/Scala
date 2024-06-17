import scala.io.StdIn._

//case class Employee(name: String, ssid: String, designation: String, salary: Double)

object EmployeeRecord extends App {
  var employees = Array[Employee]()

  def displayEmployees(): Unit = {
    println("\nCurrent Employee Records:")
    println("Name\tSSID\tDesignation\tSalary")
    employees.foreach(emp => println(s"${emp.name}\t${emp.ssid}\t${emp.designation}\t${emp.salary}"))
  }

  var running = true
  while (running) {
    println("\nEmployee Record System")
    println("1. Add an Employee Record")
    println("2. Delete an Employee Record")
    println("3. Search Employee records by SSID")
    println("4. Calculate total salary based on designation")
    println("5. Exit")
    print("Choose an option: ")

    val option = readLine()
    option match {
      case "1" =>
        println("Enter Employee Name:")
        val name = readLine()
        println("Enter SSID:")
        val ssid = readLine()
        println("Enter Designation:")
        val designation = readLine()
        println("Enter Salary:")
        val salary = readDouble()
        employees :+= Employee(name, ssid, designation, salary)
        println("Employee added successfully.")

      case "2" =>
        println("Enter SSID of Employee to delete:")
        val ssid = readLine()
        val filteredEmployees = employees.filterNot(_.ssid == ssid)
        if (filteredEmployees.length != employees.length) {
          employees = filteredEmployees
          println("Employee removed.")
        } else {
          println("No employee found with given SSID.")
        }

      case "3" =>
        println("Enter SSID of Employee to search:")
        val ssid = readLine()
        employees.find(_.ssid == ssid) match {
          case Some(emp) => println(s"Found: ${emp.name}, ${emp.ssid}, ${emp.designation}, ${emp.salary}")
          case None => println("No employee found with given SSID.")
        }

      case "4" =>
        println("Enter Designation to calculate total salary:")
        val designation = readLine()
        val totalSalary = employees.filter(_.designation == designation).map(_.salary).sum
        println(s"Total salary for $designation: $totalSalary")

      case "5" =>
        running = false

      case _ =>
        println("Invalid option.")
    }

    if (running) displayEmployees()
  }
}
