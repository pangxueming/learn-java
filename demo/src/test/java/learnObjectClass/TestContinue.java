package learnObjectClass;

public class TestContinue {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int num : numbers) {
      if (num == 30) {
        // 跳出当前循环，进入下一次循环
        continue;
      }

      System.out.println(num);
    }
  }
}
