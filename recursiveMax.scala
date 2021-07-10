  def getMax(ar: scala.collection.mutable.ArrayBuffer[Int]): Int = {
    //println("hi")
    if (ar.length == 2) {
      return ar(0).max(ar(1))
    } else {
      return ar(0).max(getMax(ar.drop(1)))
    }
  }
