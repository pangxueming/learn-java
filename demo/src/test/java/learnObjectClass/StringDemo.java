package learnObjectClass;

public class StringDemo {
  public static void main(String[] args) {
    char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
//    String helloString = new String(helloArray);
//    System.out.println(helloString);
    StringBuilder sbt = new StringBuilder("xxx23x1212");
    sbt.append("xx21fs1d2f13");

    // 字符串长度
    String site = "www.biomatch.com";
    int len = site.length();
    System.out.println("佰迈起网站地址" + site + "长度为：" + len);

    int index = site.lastIndexOf("match");
    System.out.println(index);
  }
}
