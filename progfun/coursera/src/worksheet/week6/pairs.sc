object pairs{

  //Exercice
  def isPrime(n: Int): Boolean =
    (2 until n) forall (d => n % d != 0)
  val n = 7

  //for(int i){
  //  for(int j){
  //  }
  //}
  //Sequence of sum of elements to a theshold where
  //the sum of the numbers is a prime number

  (1 until n) flatMap(i =>
    (1 until i) map (j => (i, j))) filter (pair =>
    isPrime(pair._1 + pair._2))

  //or using for expression

  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)

}