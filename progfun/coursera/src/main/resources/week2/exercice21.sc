object exercice21 {

  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)
  def singletonSet(elem: Int): Set = Set(elem)
  def union(s: Set, t: Set): Set =


  singletonSet(1)
  contains(Set(1), 1)
  union(Set(1),Set(2))



}