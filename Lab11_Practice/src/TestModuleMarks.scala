import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import ModuleMarks._


class TestModuleMarks { //For testing object cannot be created, only class

  @Test (expected = classOf[ IllegalArgumentException]) def testIllegalNegative(): Unit = {
    getClassification(-5)
  }

  @Test def testFail(): Unit = {
    assertEquals("20 from {0..39}", Fail, getClassification(20))
  }

  @Test def testThird(): Unit = {
    assertEquals("45 from {40..49}", Third, getClassification(45))
  }

  @Test def testLowerSecond(): Unit = {
    assertEquals(("55 from {50..59}"), LowerSecond, getClassification(55))
  }

  @Test def testUpperSecond(): Unit = {
    assertEquals(("65 from {60..69}"), UpperSecond, getClassification(65))
  }

  @Test def testFirst(): Unit = {
    assertEquals(("77 from {70..100}"), First, getClassification(77))
  }

  @Test(expected = classOf[IllegalArgumentException]) def testIllegalMore(): Unit = {
    getClassification(110)
  }

}