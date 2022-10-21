package test;

import java.util.Arrays;
import java.util.List;

public class StringList {
  public static void main(String[] args) {
    //定义一个字符长度为5的字符串
    String[] strings = new String[5];
    strings[0] = "a";
    strings[1] = "b";
    strings[2] = "c";
    strings[3] = "d";
    strings[4] = "e";

        /* 调用Arrays中的asList方法将String[]转化为List<String>
            Arrays.asList方法不支持add()、remove()、clear()
         */
    List<String> list = Arrays.asList(strings);

    System.out.println(list);
    System.out.println("list<String>:" + list.toString());

    //调用toArray方法将List<String>转化为String[]
    String[] stirs = list.toArray(new String[]{});
    System.out.println("String[]:" + Arrays.toString(stirs));
    System.out.println("list" + list);
    //为list添加一个元素
//        list.add("xxx");
    System.out.println("list<String>:" + list.toString());
  }
}
