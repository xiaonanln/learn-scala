import util.Random
import collection.mutable.ArrayBuffer
import scala.util.Sorting
import java.util.Scanner
import java.io.File
import collection.mutable
import collection.immutable
import scala.collection.JavaConversions.mapAsScalaMap


class Counter {
  private var value : BigInt = Int.MaxValue
  def increment(): Unit = {
    value = value + 1
  }
  def current() = value
}

def ex5_1(): Unit = {
  val c = new Counter()
  println(c.current)
  c.increment()
  println(c.current())
}

class BankAccount {
  private var _balance = 0

  def deposit(amount: Int): Unit = {
    _balance = _balance + amount
  }
  def withdraw(amount: Int): Unit = {
    _balance -= amount
  }
  def balance = _balance
}

def ex5_2(): Unit = {
  val ba = new BankAccount
  ba.deposit(10)
  println("balance", ba.balance)
}

class Time(val hrs: Int, val min: Int) {
  def before(other: Time): Boolean = {
    if (hrs < other.hrs) true
    else if (hrs > other.hrs) false
    else min < other.min
  }

  override def toString: String = {
    String.format("%d:%d", hrs.asInstanceOf[Object], min.asInstanceOf[Object])
  }
}

def ex5_3(): Unit = {
  val t1 = new Time(10, 20)
  val t2 = new Time(20, 20)
  printf("%d:%d\n", t1.hrs, t1.min)
  printf("%d:%d\n", t2.hrs, t2.min)
  println(t1.before(t2))
}

def ex5_5(): Unit = {

}