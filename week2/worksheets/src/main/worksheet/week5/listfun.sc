object listfun{

  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")


  nums filter (x => x >0)
  nums filterNot (x => x >0)
  nums partition(x => x > 0)

  nums takeWhile (x => x > 0)
  nums dropWhile (x => x > 0)
  nums span (x => x > 0)


  //Exercise

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 =>
      if (x == xs1.head) List(List(x, xs1.head)) ::: pack(xs1)
      else List(List(x)) ::: pack(xs1)
  }

  pack(List("a", "a", "a", "b", "c", "c", "a"))

}