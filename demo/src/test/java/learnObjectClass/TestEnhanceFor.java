package learnObjectClass;

public class TestEnhanceFor {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    for (Number number : numbers) {
      System.out.println(number);
    }

    String[] names = {"James", "Larry", "Tom", "Lacy", "Judy"};
    for(String name: names) {
      System.out.println(name);
    }
  }
}
