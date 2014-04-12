
public class Euler2 {
  public static void main(String[] args) {
      int total = euler2sum();
      System.out.println(String.format("total: %d", total));
  }

  private static int euler2sum() {
      int x = 1;
      int y = 0;
      int sum = 0;
      int answer = 0;
      while (sum < 4000000) {
          sum = x + y;
          y = x;
          x = sum;
          if (sum % 2 == 0) {
              answer = answer + sum;
          }
      }
      return answer;
  }
}
