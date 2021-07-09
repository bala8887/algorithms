  def selectionSort(ar: Array[Int]) = {
    for (i <- 0 until ar.length) {
      var max = ar(i)
      var tmp = i
      var pos = i
      for (j <- i + 1 until ar.length) {
        if (ar(j) > max) {
          max = ar(j)
          tmp = j
        }
      }
      pos = max
      ar(tmp) = ar(i)
      ar(i) = pos
      println(max)
      max = 0
    }
  }
