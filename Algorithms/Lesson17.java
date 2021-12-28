package Algorithms;

public class Lesson17 {
  public static void main(String[] args) {
    int[] a = {68, 55, 72, 93, 87};
        
    int sum = 0; // 合計格納用変数
    int ave = 0; // 平均格納用変数
    for (int i = 0; i < a.length; i++) {
        sum = sum + a[i];
        ave = sum / a.length;
    }
    System.out.println(sum);
    System.out.println(ave);
  }
}
