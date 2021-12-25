package Algorithms;

public class Lesson5 {
  public static void main(String[] args) {
    int row = 5;  // 行（縦方向）の数
    int col = 7;  // 列（横方向）の数
    
    for (int i = 0; i < row; i++) {
        if (i % 2 == 0) {    // 偶数行の場合のみ実行
            for (int j = 0; j < col; j++) {
                System.out.print('■');
            }
        }
        System.out.println();
    }
  }
}
