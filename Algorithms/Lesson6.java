package Algorithms;

public class Lesson6 {
  public static void main(String[] args) {
    int row = 5;  // 行（縦方向）の数
    int col = 7;  // 列（横方向）の数
    
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {     // 偶数列の場合のみ実行
                System.out.print('■');
            } else {
                System.out.print("");
            }
        }
        System.out.println();
    }
  }
}
