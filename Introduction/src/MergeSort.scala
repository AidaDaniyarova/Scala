object MergeSort {
def main(args:Array[String]):Unit={
  var array = Array[Int](7895,87,687,558,56)
  println(Merge_Sort(array, 0, array.length-1))
}
}

def Merge(A:Array[Int], start:Int, mid:Int, end:Int): Unit={
  var starty = start
  var p = start
  var q = mid+1
  var Arr= new Array[Int](end-start+1)
  var k = 0
  var i = 0
  for(i <-start to end){
    if(p>mid){
      k+=1; q+=1
      Arr(k)=Arr(q)
    }
    else if(q>end){
      k+=1; p+=1
      Arr(k)=Arr(p)
    }
    else if(A(p)<A(q)){
      k += 1; p += 1
      Arr(k) = Arr(p)
    }
    else {
      k += 1; q += 1
      Arr(k) = Arr(q)
    }
  }

  for(p <- 0 to k){
    starty+=1
    Arr(starty)=Arr(p)
  }
}

def Merge_Sort(A:Array[Int], start:Int, end:Int): Unit={
  if(start<end){
    var mid = (start + end)/2

    Merge_Sort(A, start, mid)
    Merge_Sort(A, mid+1, end)

    Merge(A, start, mid, end)
  }

}
