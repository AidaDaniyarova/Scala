import org.junit.Test
import org.junit.Assert._


class TestBinarySearch {

  @Test
  def testBinarySearch(): Unit = {
    val numArr = Array[Int](6, 11 , 13, 34, 45, 65, 67, 68, 89, 99)
    val sortedArray = numArr.sorted
    val key = 68
    val start = 0
    val end = sortedArray.length - 1
    val result = BinarySearch.binarySearch(sortedArray, key, start, end)
    assertEquals(7, result) // Expecting the key 68 to be found at index 8 in the sorted array
  }

  @Test
  def testNotFound(): Unit = {
    val numArr = Array[Int](13, 45, 65, 67, 89, 34, 11, 6, 68, 89)
    val sortedArray = numArr.sorted
    val key = 100 // A key that doesn't exist in the array
    val start = 0
    val end = sortedArray.length - 1
    val result = BinarySearch.binarySearch(sortedArray, key, start, end)
    assertEquals(-1, result) // Expecting the key 100 to not be found in the sorted array
  }
}