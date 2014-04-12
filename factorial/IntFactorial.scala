
implicit class IntFactorial(i: Int) {
  def factorial = fact(i)
  private def fact(n: BigInt): BigInt =
    if (n <= 1)
      1
    else
      n * fact(n - 1)
}

