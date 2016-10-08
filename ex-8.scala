class BankAccount(initializeBalance: Double) {
  protected var balance = initializeBalance
  val WITHDRAW_FEE = 1
  val DEPOSIT_FEE = 1

  def deposit(amount: Double) = {
    assert(amount > DEPOSIT_FEE)
    balance += (amount - DEPOSIT_FEE); balance
  }

  def withdraw(amount: Double) = {
    balance -= (amount + WITHDRAW_FEE); balance
  }

  def dump(): Unit = {
    printf("%s: %.2f\n", this, balance)
  }
}

def ex_8_1(): Unit = {
  val ba = new BankAccount(100)
  ba.deposit(100)
  ba.dump()
  ba.withdraw(100)
  ba.dump()
}

ex_8_1()

import java.util.Date

class SavingsAccount(initializeBalance: Double) extends BankAccount(initializeBalance) {

  val FEE_FREE_COUNT_PER_MONTH = 3

  class MonthlyData {
    var ts = new Date() // timestamp
    var feeFreeCount = 0
  }

  val monthly = new MonthlyData()

  override def deposit(amount: Double): Double = {
    earnMonthlyInterest()
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    earnMonthlyInterest()
    super.withdraw(amount)
  }

  def earnMonthlyInterest(): Unit = {
    val now = new Date()
    if (!isSameMonth(now, monthly.ts)) {
      monthly.ts = now
      monthly.feeFreeCount = 0
      balance += 10
    }
  }

  def isSameMonth(t1: Date, t2: Date) = {
    t1.getYear == t2.getYear && t1.getMonth == t2.getMonth
  }

}

def ex_8_2(): Unit = {

}
