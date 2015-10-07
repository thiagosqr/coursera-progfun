import scala.tools.nsc.Global.flatten

object test {

  val xs = Array(1,2,3,44)
  xs map (x => x * 2)
  val s = "Hello World"
  s.filter (c => c.isUpper)
  s exists (c => c.isUpper)
  s forall (c => c.isUpper)
  val pairs = List(1,2,3) zip s
  pairs.unzip
  s.flatMap (c => List(c, '.'))
  xs.sum
  xs.max
  xs.min
  //Scalar Product
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map { case (x,y) => x * y}.sum // () are left out because of rule of only one param
                                               // match not necessary because of only one param

  //Exercice
  def isPrime(n: Int): Boolean =
    (2 until n) forall (d => n % d != 0)
  isPrime(5)
  //Exercise
  def scalarProductWithFor(xs: Vector[Double], ys: Vector[Double]): Double =

    (for{
      (x,y) <- xs zip ys
    } yield x * y).sum

}