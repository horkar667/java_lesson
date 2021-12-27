package Algorithms;

public class Lesson12 {
  public static void main(String[] args) {
    int n = 20; // 表示の最大値
        
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0) { // 3の倍数か
            System.out.print('?');
        } else {
            System.out.print(i);
        }
        
        if (i != n) { // 最後の表示でないか
            System.out.print(',');
        }
    }
  }
}
