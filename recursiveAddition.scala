  def getSum(ar: scala.collection.mutable.ArrayBuffer[Int]): Int = {
    if (ar.length == 1) {
      println("last one")
      return ar(0)
    } else {
      return ar(0) + getSum(ar.drop(1))
    }
  }
