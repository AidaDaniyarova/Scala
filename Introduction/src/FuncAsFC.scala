object FuncAsFC {
  def main(args: Array[String]): Unit = {
    val processAndDisplay: (Int, String) => String = (a, b) => {
      var num = a + 100
      var message = b + "DMUK"
      "Text:" + num + "Text" + message
    }
    val processedResult = processAndDisplay(256, "Hello")
    println(processedResult)

    val myValues = (1 to 10) map (x => x + 1)
    println(myValues)

    def funFactory(x: Int): (Int => Int) = {
      x match {
        case 1 => (y => y + 1)
        case 2 => (y => y + 2)
      }
    }
    val fun = funFactory(2)
    println(fun(10))


    val squareRoot: PartialFunction[Double,Double]={ // both input and return value in []
      //def apply(x:Double) =Math.sqrt(x)
      //def isDefinedAt(x:Double) = x >=0
      case x if x >= 0 => Math.sqrt(x)
      case y if y<= -1 => 0
    }

    println(squareRoot(-144))
    println(squareRoot(144))

    def addition(x:Int,y:Int) = x+y

    def additionCurry(x:Int)(y:Int) = x+y // the arguments are separated into 2 arg receivers

    val add:Int => (Int => Int) = x => (y => x+y)

    val sum = additionCurry(20)
    println(sum(11))
    println(addition(10,20))
    println(additionCurry(10)(23))
    println(add(23)(85))

    def addSample(a:Int)(b:Int)(c:Int) = a+b+c

    val sum1 = addSample(100)
    val sum2 = addSample(500)
    val sum3 = sum1(645)
    val sum4 = sum2(90)
    println(sum4(110))
    println(sum3(23))

    var name = Array[String]("John","Rose", "Arman","Alex")
    var city = Array[String]("Astana", "Almaty","Astana","Aktobe")

    def arriveFrom(name:Array[String])(city:Array[String])={
      val lsize = name.length
      (0 until lsize).foreach(x => println(s"${name(x)} is from ${city(x)}"))
    }
    val funct = arriveFrom(name)
    funct(city)

  }
}
