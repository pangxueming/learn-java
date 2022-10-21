package learnObjectClass;

public class Test {
  private static int NUM = 12;

  private static void changeNum() {
    NUM = 13;
  }

  public void logMessage() {
    System.out.println("logMessage is be using");
  }

  public static void main(String[] args) {
    changeNum();
    System.out.println(NUM);
    Test test = new Test();
    test.logMessage();
  }
}
