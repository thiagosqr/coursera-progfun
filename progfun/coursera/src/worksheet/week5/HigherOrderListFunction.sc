object holf {

  def squareList1(xs: List[Int]): List[Int] = xs match {
    case Nil     => Nil
    case y :: ys => y * y :: squareList1(ys)
  }
  def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x*x)

}