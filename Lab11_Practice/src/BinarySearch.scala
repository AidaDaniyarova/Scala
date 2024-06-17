object BinarySearch {

  def binarySearch(arr: Array[Int], target: Int, low: Int, high: Int): Int = {
    if (low > high)
      return -1
    else {
      val mid = (low + high) / 2
      if (arr(mid) == target)
        return mid
      else if (arr(mid) > target)
        binarySearch(arr, target, low, mid - 1)
      else
        binarySearch(arr, target, mid + 1, high)
    }
  }

}