package org.joda.time

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.Matchers

@RunWith(classOf[org.scalatest.junit.JUnitRunner])
class PlaceholderTest extends FlatSpec with Matchers {
  behavior of "seconds"
  
  it should "fail" in {
    true should be (false)
  }
}