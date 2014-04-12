
object euler2 extends App {
  val fibs: Stream[Long] = 1L #:: fibs.scanLeft(2L)(_ + _)
  val sum = fibs.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  Console println sum
}

