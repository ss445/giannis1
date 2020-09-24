package lecture

object FirstObject {
  def computeShippingCost(input:Double) : Double ={
  if (input > 30) {
    5 + .25 * (input-30)
  }
  else {
    5
  }
}
  def main(args: Array[String]): Unit = {

  }



}
