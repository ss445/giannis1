package tests

import org.scalatest._
import rhymes.Word

class TestWords extends FunSuite {
  test("Method returns number of sounds at beginning of word"){
    val decompose: Word = new Word(List("dee", "com", "pose" ))
    val decompress: Word = new Word(List("dee", "com", "press"))
    val lemon : Word =  new Word(List("lem", "on", "ate"))
    val laminate: Word = new Word(List("lem","men", "ate"))
    val nothing: Word = new Word(List())
    val short: Word = new Word(List("a"))
    val shorty: Word = new Word(List("b"))
    val wonderful: Word = new Word(List("dom","men", "lake","shore", "broom","sweep"))
    val camp: Word = new Word(List("dom", "men", "river", "shore", "time"))

    assert(lemon.alliterationLength(decompose) == 0)
    assert(laminate.alliterationLength(lemon) == 1)
    assert(decompress.alliterationLength(decompose) == 2)
    assert(nothing.alliterationLength(laminate) == 0)
    assert(short.alliterationLength(shorty) == 0)
    assert(decompose.alliterationLength(decompose)== 3)
    assert(camp.alliterationLength(wonderful)== 2)
  }

}
