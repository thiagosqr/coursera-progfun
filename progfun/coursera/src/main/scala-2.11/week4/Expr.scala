package week4

/**
 * Created by thiago on 8/25/15.
 */
trait Expr {

}


case class Number(n: Int) extends Expr {

}

case class Sum(e1: Expr, e2: Expr) extends Expr{


}

object exprs{

  def show(e: Expr): String = e match {
    case Number(n) => String.valueOf(n)
    case Sum(e1,e2) => show(e1).concat(" + ").concat(show(e2))
  }

}