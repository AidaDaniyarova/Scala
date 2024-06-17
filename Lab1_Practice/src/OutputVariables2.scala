object OutputVariables2 {
  //Exercise #9: Escape sequences and variables
    def main(args: Array[String]): Unit = {
      //a)Fill the gaps
      var option1: String = "Sometimes the world is a good place,"
      var option2: String = "and sometimes it is a bad place."
      println("\""+ option1)
      println(option2+"\"")

      //b) Store in the third variable before output
      var finalText = "\""+option1+"\n"+option2+"\""
      println(finalText)
    }
}
