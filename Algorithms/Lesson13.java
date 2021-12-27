package Algorithms;

public class Lesson13 {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) { // iの段を表示する
          int ans = i * j;
          System.out.print(ans);
          System.out.print(' ');
      }
      System.out.println();
    }

    System.out.println();

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) { // iの段を表示する
          int ans = i * j;
          if (ans < 10) { // 計算結果が1桁なら
              System.out.print(' ');
          }
          System.out.print(ans);
          System.out.print(' ');
      }
      System.out.println();
    }
  }
}
