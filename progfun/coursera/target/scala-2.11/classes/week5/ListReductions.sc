object listReduction{

  def sum(xs: List[Int]) = (0 :: xs) reduceLeft((x,y) => x+y )
  def sumReduced(xs: List[Int]) = (0 :: xs) reduceLeft(_ + _)
  def sumWithFoldLeft(xs: List[Int]) = (xs foldLeft 0)(_ + _)

  sum(List(1,1,1,1,1))
  sumReduced(List(1,1,1,1,1))
  sumWithFoldLeft(List(1,1,1,1,1))
  def product(xs: List[Int]) = (1 :: xs) reduceLeft((x,y) => x * y )
  def productReduced(xs: List[Int]) = (1 :: xs) reduceLeft(_ * _)
  def productWithFoldLeft(xs: List[Int]) = (xs foldLeft 1)(_ * _)

  product(List(1,2,3,4,5))
  productReduced(List(1,2,3,4,5))
  productWithFoldLeft(List(1,2,3,4,5))

  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x,y) => y.::(f(x)))

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)((x,y) => y+1)

  lengthFun(List(1,2,3,4,5))

  mapFun (List(1,2,3,4,5), (x: Int)  => x + 1)

}