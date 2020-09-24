package tests

import org.scalatest._
import lecture.Algebra


class TestFactoring extends FunSuite {
  test("Method returns list with all correct factors"){
    val sam: Int = 12
    val rick: Int = 27
    val tom: Int = 11
    val bob: Int = 81
    val rocket: Int = 11011
    val jane : Int = -111
    val larry: Int = 2
    val karen: Int = 0
    val kevin: Int = 1
    val volt: Int = 102302
    assert(Algebra.factor(sam).sorted==List(3,2,2).sorted)
    assert(Algebra.factor(rick).sorted==List(3,3,3).sorted)
    assert(Algebra.factor(tom).sorted==List(11).sorted)
    assert(Algebra.factor(bob).sorted==List(3,3,3,3).sorted)
    assert(Algebra.factor(rocket).sorted==List(11,13,11,7).sorted)
    assert(Algebra.factor(jane).sorted==List())
    assert(Algebra.factor(larry).sorted==List(2).sorted)
    assert(Algebra.factor(karen).sorted==List())
    assert(Algebra.factor(kevin).sorted==List())
    assert(Algebra.factor(volt).sorted==List(2,51151).sorted)
  }

}
