package learnObjectClass;

import java.util.Arrays;

public class TestCharacter {
  private char uniChar = 'a';
  private int in;
  private String str = "不可变";

  private void setStr(String str) {
    this.str = str;
  }

  private char[] charArr = {'a', 'b', 'c', 'd', '2', '3'};

  @Override
  public String toString() {
    return "TestCharacter{" +
        "uniChar=" + uniChar +
        ", in=" + in +
        ", str='" + str + '\'' +
        ", charArr=" + Arrays.toString(charArr) +
        '}';
  }

  public static void main(String[] args) {
    TestCharacter testCharacter = new TestCharacter();
//    testCharacter.test();
    System.out.println(testCharacter.str == "不可变");
  }

  public void test() {
    System.out.println();
    test();
  }
}
