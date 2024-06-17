object ModuleResults {
  //Exercise #4: modulemark

  def getResult(c:Int, e:Int):String={
    if((c>=0 && c<=100) && (e>=0 && e<=100)){
      var overallMark = (c+e)/2
      if(overallMark>=40) return "passed"
      else if(c<40 && e>=40) return "resit coursework"
      else if(e<40 && c>=40) return "resit exam"
      else "resit module"
    }
    else return "invalid inputs"
  }

    def main(args: Array[String]):Unit={

    }
}
