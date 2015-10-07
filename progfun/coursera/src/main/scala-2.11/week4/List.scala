package week4

import java.util.NoSuchElementException

/**
 * Created by thiago on 8/18/15.
 */
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{

  def isEmpty: Boolean = false

}

object Nil extends List[Nothing] {

  override def isEmpty: Boolean = true

  override def tail: Nothing = throw new NoSuchElementException("Nil.Head")

  override def head: Nothing = throw new NoSuchElementException("Nil.Head")

}

object test{
  val x: List[String] = Nil
}

object List{

  def apply[T](el: T): List[T] = new Cons(el, Nil)

  def apply[T](el: T, el2 : T): List[T] = new Cons(el, new Cons(el2, Nil))

  def apply[T](el: T, el2 : T, el3 : T): List[T] = new Cons(el, new Cons(el2, new Cons(el3, Nil)))

}


