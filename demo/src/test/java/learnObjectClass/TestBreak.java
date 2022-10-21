package learnObjectClass;

public class TestBreak {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int num : numbers) {
      if (num > 30) {
        break;
      }

      System.out.println(num);
    }
  }
}
