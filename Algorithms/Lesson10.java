package Algorithms;

public class Lesson10 {
  public static void main(String[] args) {
    int n = 7; // 表示の最大値
        
    for (int i = 1; i <= n; i++) {
        System.out.println(i);
    }
    
    System.out.println();
    
    for (int i = 1; i <= n; i++) {
      int ans = i * 10; // 10倍の計算
      System.out.println(ans);
    }

    System.out.println();
    
    int bai = 5; // 倍数の指定
        
    for (int i = 1; i <= n; i++) {
        int ans = i * bai; // 倍数の計算
        System.out.println(ans);
    }

    System.out.println();

    for (int i = 1; i <= n; i++) {
      System.out.println(n - i + 1);
    }
  }
}
