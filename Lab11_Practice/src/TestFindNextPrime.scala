import org.junit.Test
import org.junit.Assert._
import FindNextPrime._

class TestFindNextPrime {

  @Test def testIsPrime1(): Unit = {
    assertFalse("Negative numbers are not prime", isPrime(-5))
  }

  @Test def testIsPrime2(): Unit = {
    assertFalse("0 is not prime", isPrime(0))
  }

  @Test def testIsPrime3(): Unit = {
    assertFalse("1 is not prime", isPrime(1))
  }

  @Test def testIsPrime4(): Unit = {
    assertTrue("2 is the lowest prime", isPrime(2))
  }

  @Test def testIsPrime5(): Unit = {
    assertTrue("3 is prime", isPrime(3))
  }

  @Test def testIsPrime6(): Unit = {
    assertFalse("4 is not prime", isPrime(4))
  }

  @Test def testIsPrime7(): Unit = {
    assertTrue("107 is prime", isPrime(107))
  }

  @Test def testIsPrime8(): Unit = {
    assertFalse("106 is not prime", isPrime(106))
  }

  @Test def testGetCandidate1(): Unit = {
    assertEquals(5, getNextCandidate(3))
  }

  @Test def testGetCandidate2(): Unit = {
    assertEquals(5, getNextCandidate(4))
  }

  @Test def testGetCandidate3(): Unit = {
    assertEquals(2, getNextCandidate(-10))
  }
}