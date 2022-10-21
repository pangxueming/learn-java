package test;

public class Test {
  private int counter = 1;
  private int count = 2;

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "Test{" +
        "count=" + count +
        '}';
  }

  public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("xxx");
//        System.out.println(list);
//        String[] strings = new String[]{"1", "2"};
//        strings[0] = "aaa";

//        System.out.println(Arrays.asList(strings).toString());
//        counter++;

//    HelloWorld helloWorld = new HelloWorld(1);
//    helloWorld.increment();
  }

  public static void increment() {
    int num = 1;
    num++;
    System.out.println(num);
  }
}
