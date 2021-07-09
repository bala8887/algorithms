  def binarySearch(a : List[Int], givenNo : Int) : Unit = {
    //Need to set up counter to know the number of iterations
    //Should check the givenNo with minimum and maximum value
    val med = a.length / 2
    if (med < 1) {
      println("exit")
    } else {
      if (a(med) == givenNo) {
        println("exists")
      } else if (a(med) > givenNo) {
        binarySearch(a.slice(0, med), givenNo)
      } else {
        binarySearch(a.slice(med, a.length), givenNo)
      }
    }
  }
