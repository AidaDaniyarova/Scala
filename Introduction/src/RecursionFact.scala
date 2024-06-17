object RecursionFact {
   def main(args:Array[String]):Unit={
     var i = 7
     var result = RecursEasyWay(i)
     println(s"The factorial of $i is $result")
     var sumOfdigits = SumOFDigit(785365)
     println(sumOfdigits)

     var arr2 = Array[Int](8,5,7,6,9,4,2)
     var arr = arr2.sorted
     arr.foreach(elem => print(s"$elem "))
     println
     println(BinarySearch(arr, 8,0,arr.length-1))
   }

   def Factorial(a:Int):Int= { //Value passed to function by default becomes val, immutable
     var fact = 1
     var i = a
     while(i!=0){
       fact*=i
       i=i-1
     }
     return fact
   }

   def RecursFactorial(a:Int,facto:Int):Int={
     var fact = facto
     var i = a
     if(i>0) {
       fact*=i
       i-=1
       return RecursFactorial(i,fact)
     } else return fact
   }

   def RecursEasyWay(i:Int):Int={
     if(i==1){
       return 1
     }
     return i*RecursEasyWay(i-1)
   }

   def SumOFDigit(a:Int):Int={
     if(a==0) return 0

     return a%10 + SumOFDigit(a/10)
   }

   def BinarySearch(arr: Array[Int], target:Int, low:Int, high:Int): String = {
     if(low>high) return s"The $target is not found"
     else {
       var medium = (low + high) / 2
       if (arr(medium) == target) return s"The $target is found under index ${medium+1}"
       else if (target > arr(medium))
         BinarySearch(arr, target, medium + 1, high)
       else
         BinarySearch(arr, target, low, medium - 1)
     }
   }
}
