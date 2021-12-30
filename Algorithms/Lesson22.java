package Algorithms;

public class Lesson22 {
  public static void main(String[] args) {
    int[] a = {68, 55, 72, 93, 87};
        
    System.out.println("並び替え前");
    for(int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
    
    for (int i = 0; i < a.length; i++) {
        int minIndex = i; // 暫定最小値の添字
        
        for (int j = i + 1; j < a.length; j++) { // 最小値探索ループ
            if (a[minIndex] > a[j]) {
                minIndex = j;
            }
        }
        
        int work = a[i];
        a[i] = a[minIndex]; // 区間最小値を区間先頭に移動
        a[minIndex] = work;
    }
    
    System.out.println("並び替え後");
    for(int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
  }
}
