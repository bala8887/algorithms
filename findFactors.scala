def findFactors(num : Int, outputList : List[Int] = List.empty, minFactor : Int = 2) : List[Int] = {
  if (minFactor * minFactor > num) {
	  outputList :+ num
	} else {
	  if (num % minFactor == 0) {
		  findFactors(num/x, outputList :+ minFactor, minFactor)
		} else {
		  findFactors(num, outputList, minFactor+1)
		}
	}
}
