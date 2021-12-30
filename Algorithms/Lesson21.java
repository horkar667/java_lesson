package Algorithms;

public class Lesson21 {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    
    System.out.println("スワップ処理前");
    System.out.println("x : " + x);
    System.out.println("y : " + y);
    
    int work; // 一時退避用変数
    
    // スワップ処理
    work = x; //一方を退避
    x = y; // 退避済みの変数に上書き
    y = work; // 退避先からコピー
    
    System.out.println("スワップ処理後");
    System.out.println("x : " + x);
    System.out.println("y : " + y);
  }
}
