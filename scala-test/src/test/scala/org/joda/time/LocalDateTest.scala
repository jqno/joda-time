package org.joda.time

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.Matchers

@RunWith(classOf[org.scalatest.junit.JUnitRunner])
class LocalDateTest extends FlatSpec with Matchers {

  behavior of "ScalaTest"
  
  it should "fail" in {
    true should be (false)
  }


  behavior of "LocalDate constructor"

  it should "fail if the month is invalid" in {
    intercept[IllegalFieldValueException] {
      new LocalDate(2015, 13, 1)
    }
  }

  it should "fill in the month correctly" in {
    val d = new LocalDate(2015, 7, 8)
    d.getMonthOfYear should be (7)
  }

  it should "???" in {
    val yourTestGoesHere = ???
  }


  // Some inspiration

  behavior of "LocalDate.plusDays"

  behavior of "LocalDate.fromCalendarFields"

  behavior of "LocalDate.parse"
}