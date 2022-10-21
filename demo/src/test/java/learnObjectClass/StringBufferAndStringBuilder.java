package learnObjectClass;

public class StringBufferAndStringBuilder {
  public static void main(String[] args) {
    StringBuilder sbr = new StringBuilder(10);
    sbr.append("biomatch..");
    System.out.println(sbr);
    sbr.append("!");
    System.out.println(sbr);
    sbr.insert(9,"java");
    System.out.println(sbr);
    sbr.delete(4, 5);
    System.out.println(sbr);
  }
}
