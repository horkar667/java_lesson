package Algorithms;

public class Lesson9 {
  public static void main(String[] args) {
    int n = 8;
        
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j == i) { // 行カウンタと列カウンタが等しいか
                System.out.print('■');
                break; // ループを抜ける
            } else {
                System.out.print('　');
            }
        }
        System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          if (j == n - i - 1) { // ■を表示すべき値になったら
              System.out.print('■');
              break; // ループを抜ける
          } else {
              System.out.print('　');
          }
      }
      System.out.println();
  }
  }
}
