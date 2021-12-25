package Algorithms;
public class Lesson4 {
  public static void main(String[] args) {
    int n = 10;  // 繰り返しの数＝全体の文字数
        
    for (int i = 0; i < n; i++) {
        if (i % 2 == 1) { // 奇数なら◆、偶数なら◇
            System.out.print('◆');
        } else {
            System.out.print('◇');
        }
    }
  }
}