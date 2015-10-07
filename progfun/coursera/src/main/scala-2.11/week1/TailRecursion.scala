package week1


/**
 * Created by thiago on 11/4/14.
 */
object NonTailRecursiveFactorial {

  def test(): Unit = {
    System.out println factorial(5)
  }

  def factorial(n: Int): Int = {

    if(n == 0) 1 else n * factorial(n -1)
  }

}


object TailRecursiveFactorial {

  def factorial(n: Int): Int = {

    def loop(acc: Int, n: Int): Int = {

      if (n == 0 ) acc

      else  loop(acc * n,  n - 1)

    }

    loop(1, n)
  }


}
