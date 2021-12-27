package Algorithms;

public class Lesson14 {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40, 50}; // 操作対象配列の宣言と初期化
        
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }

    System.out.println();

    for (int i = a.length - 1; i >= 0; i--) {
      System.out.println(a[i]);
    }

    System.out.println();

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i != a.length - 1) { // 添字の最後でないか
          System.out.print(',');
      }
    }
  }
}
