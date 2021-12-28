package Algorithms;

public class Lesson18 {
  public static void main(String[] args) {
    int[] a = {68, 55, 72, 93, 87};
    int min = 80; // 指定の範囲（最小）
    int max = 100; // 指定の範囲（最大）
    
    int sum = 0; // 合計格納用変数
    
    for (int i = 0; i < a.length; i++) {
        if (min <= a[i] && a[i] <= max) {
            sum = sum + a[i];
        }
    }
    System.out.println(sum);
  }
}
