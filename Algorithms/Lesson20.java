package Algorithms;

public class Lesson20 {
  public static void main(String[] args) {
    int[] a = {68, 55, 72, 93, 87};
        
    int minValue = a[0]; // 暫定最小値
    int minIndex = 0; // 暫定最小値の添字
    
    for (int i = 1; i < a.length; i++) {
        if (minValue > a[i]) { // 暫定最小値より小さいか
            minValue = a[i];
            minIndex = i;
        }
    }
    System.out.println(minValue);
    System.out.println(minIndex);

    int maxValue = a[0]; // 暫定最大値
    int maxIndex = 0; // 暫定最大値の添字
    
    for (int i = 1; i < a.length; i++) {
        if (maxValue < a[i]) { // 暫定最大値より大きいか
            maxValue = a[i];
            maxIndex = i;
        }
    }
    System.out.println(maxValue);
    System.out.println(maxIndex);
  }
}
