package Algorithms;

public class Lesson7 {
  public static void main(String[] args) {
    int row = 6;  // 行（縦方向）の数
    int col = 10;  // 列（横方向）の数
    
    for (int i = 0; i < row; i++) {
        int x = i % 2; // 偶数行の場合は0、奇数行の場合は1
        
        for (int j = 0; j < col; j++) {
            // 偶数行の場合は偶数列が■、奇数行の場合は奇数列が■
            if (j % 2 == x) {
                System.out.print('■');
            } else {
                System.out.print('　');
            }
        }
        System.out.println();
    }
  }
}
