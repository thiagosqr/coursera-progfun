object mergesort {

  //For implicit params compiler will search for an implicit definition that
  //is marked implicit
  //has type compatible with T
  //is visible at point of the func call, or is defined in a companion object associated with T
  def msort[T](xs: List[T])(implicit lt: (T,T) => Boolean): List[T] = {
    val n = xs.length /2
    if(n == 0) xs

    else{

      def merge(xs: List[T], ys: List[T]): List[T] = (xs,ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x,y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge (msort(fst) , msort(snd))

    }
  }

  val nums = List(2, -4, 5,7,1)
  //Function param passed as last so compiler can infer type
  //params for function param based on first param
  msort(nums)((x,y) => x < y)

}