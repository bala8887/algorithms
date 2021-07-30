 object QuickSort {
    def sortFunction(ar : Array[Int]): Array[Int] = {
      if (ar.length <= 1) ar
      else sortFunction(ar.filter(_ < ar(0))) ++ List(ar(0)) ++ sortFunction(ar.filter(_ > ar(0)))
    }
  }
