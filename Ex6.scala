import util.Random
import collection.mutable.ArrayBuffer
import scala.util.Sorting
import java.util.Scanner
import java.io.File
import collection.mutable
import collection.immutable
import scala.collection.JavaConversions.mapAsScalaMap

object Conversions {
  def inchesToCentimeters(inch: Double):Double = {
    inch
  }
}

object Origin extends java.awt.Point {

}


class Point(val x: Double, val y: Double) {
  override def toString: String = {
    "(%f,%f)".format(x,y)
  }
}

object Point {
  def apply(x: Double, y: Double): Point = {
    new Point(x, y)
  }
}

object CardType extends Enumeration {
  abstract class CardTypeValue extends Value {

  }
  val CT1 = CardTypeValue
  val CT2 = CardTypeValue
  val CT3 = CardTypeValue
  val CT4 = CardTypeValue
}

object Ex6 extends App {
}


val ct1 = CardType.CT1
println(ct1)
