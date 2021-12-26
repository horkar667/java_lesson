package Algorithms;

public class Lesson8 {
  public static void main(String[] args) {
    int n = 8;  // 繰り返しの数
        
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print('■');
        }
        System.out.println();
    }

    System.out.println();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print('■');
        }
        System.out.println();
    }
  }
}
