object polynomials {

  class Poly(terms0: Map[Int, Double]){
    def this(bindings: (Int,Double)*) = this(bindings.toMap)

    var terms = terms0 withDefaultValue 0.0

    def + (other: Poly) =
      new Poly((other.terms foldLeft terms)(addTerm(_, _)))

    def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] =
      terms + (term._1 -> (terms(term._1) + term._2))

    def adjust(term: (Int, Double)): (Int,Double) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))

    }

  }

}