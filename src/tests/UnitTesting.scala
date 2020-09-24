package tests

import org.scalatest._
import lecture.FirstObject

class UnitTesting extends FunSuite {
  test("Weight Under 30 Always 5"){
    val underThirty0: Double = 27
    val underThirty1: Double = 19
    val underThirty2: Double = 14
    val underThirty3: Double = 21
    assert(FirstObject.computeShippingCost(underThirty0)== 5)
    assert(FirstObject.computeShippingCost(underThirty1)== 5)
    assert(FirstObject.computeShippingCost(underThirty2)== 5)
    assert(FirstObject.computeShippingCost(underThirty3)== 5)

  }
  test("Weight Over 30 is Taxed By the Pound"){
    val overThirty0: Double = 31
    val overThirty1: Double = 40
    val overThirty2: Double = 33
    val overThirty3: Double = 30.0001
    assert(FirstObject.computeShippingCost(overThirty0)== 5 + (31-30)* 0.25)
    assert(FirstObject.computeShippingCost(overThirty1)== 5 + (40-30) * 0.25)
    assert(FirstObject.computeShippingCost(overThirty2)== 5 + (33-30) * 0.25)
    assert(FirstObject.computeShippingCost(overThirty3)== 5 + (30.0001-30) * 0.25)
  }

}
