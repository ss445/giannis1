package lecture

object Algebra {
  def factor (n: Int) : List[Int]={
    var lst: List[Int] = List()
    var c = n
    if (c > 1) {
      while (c % 2 == 0){
         c /= 2
         lst = 2 :: lst

      }

    for (i <- 3 to c) {
        while (c % i == 0) {
          c /= i
          lst = i :: lst


        }
    }
    }
      ;lst



  }

  def main(args: Array[String]): Unit
  =
  {

  }

}
