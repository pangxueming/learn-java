package test;

public class HelloWorld {
  private int counter = 0;

  public static void main(String[] args) {
    Test test = new Test();
    test.setCounter(22);
    System.out.println(test.toString());
  }

  public HelloWorld(int i) {
    this.counter = i;
  }

  public void increment() {
//    Test test = new Test();
//    test.setCounter(33);
//    test.setCount(22);
//    return counter;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}
