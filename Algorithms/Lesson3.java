package Algorithms;

public class Lesson3 {
  public static void main(String[] args) {
    int row = 5;  // 行（縦方向）の数
    int col = 5;  // 列（横方向）の数
    
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print('●');
        }
        System.out.println();
    }
  }
}
