import scala.reflect.runtime.universe._

class C {
  def x1: Int = ???
  def x2(): Int = ???
  def x3(x: Int): Int = ???
  def x4(x: Int)(y: Int): Int = ???

  def y1[T]: Int = ???
  def y2[T](): Int = ???
  def y3[T](x: Int): Int = ???
  def y4[T](x: Int)(y: Int): Int = ???
}

object Test extends App {
  println(typeOf[C].member(newTermName("x1")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("x2")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("x3")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("x4")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("y1")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("y2")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("y3")).asMethodSymbol.typeParams)
  println(typeOf[C].member(newTermName("y4")).asMethodSymbol.typeParams)
}