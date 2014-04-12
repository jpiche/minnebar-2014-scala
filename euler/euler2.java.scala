
object Euler2 {
  val total: Int = euler2sum();
  Console.println("total: %d".format(total));

  private def euler2sum(): Int = {
    var x = 1;
    var y = 0;
    var sum = 0;
    var answer = 0;
    while (sum < 4000000) {
      sum = x + y;
      y = x;
      x = sum;
      if (sum % 2 == 0) {
        answer = answer + sum;
      }
    }
    answer;
  }
}
