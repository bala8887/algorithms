  def getSum(ar: scala.collection.mutable.ArrayBuffer[Int]): Int = {
    println("hi")
    if (ar.length == 1) {
      println("last one")
      return ar(0)
    } else {
      //println(ar.drop(ar(0)).mkString(","))
      return ar(0) + getSum(ar.drop(1))
    }
  }
