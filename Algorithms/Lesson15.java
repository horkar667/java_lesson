package Algorithms;

public class Lesson15 {
  public static void main(String[] args) {
    String[] a = {"abc", "abcd", "abcde", "xx", "yyy"};
    int n = 3; // 指定の文字数
    
    for (int i = 0; i < a.length; i++) {
      if (a[i].length() <= n) { // 指定の文字数以下か
          System.out.println(a[i]);
      }
    }
  }
}
