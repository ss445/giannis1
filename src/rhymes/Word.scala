package rhymes

class Word(val lst:List[String]) {
  var tame: Int = 0

  def alliterationLength(covid: Word): Int = {
    val charles = this.lst
    val tim = covid.lst
    for (i <- charles.indices) {
      if (charles.apply(i) == tim.apply(i)) {

        tame += 1
      }
      else {
        return tame
      }


    };tame


  }


}