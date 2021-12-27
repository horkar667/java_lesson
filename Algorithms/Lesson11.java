package Algorithms;

public class Lesson11 {
  public static void main(String[] args) {
    int n = 7;
        
    for (int i = 1; i <= n; i++) {
        System.out.print(i);
        System.out.print(',');
    }

    System.out.println();
    
    for (int i = 1; i <= n; i++) {
      System.out.print(i);
      if (i != n) { // 最後の表示でないか
          System.out.print(',');
      }
    }
  }
}
