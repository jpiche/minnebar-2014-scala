
import scala.annotation.tailrec
import scala.language.postfixOps

implicit class IntFactBetter(i: Int) {
  lazy val ! = fact(i)

  private def fact(n: BigInt) = {
    @tailrec
    def factAcc(n: BigInt, acc: BigInt): BigInt =
      if (n == 0)
        acc
      else
        factAcc(n - 1, n * acc)

    factAcc(n, 1)
  }
}

