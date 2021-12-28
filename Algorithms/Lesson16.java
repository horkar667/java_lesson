package Algorithms;

public class Lesson16 {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40, 50};
    int[] b = new int[a.length]; // コピー先配列の宣言（自動で0で初期化）
    
    for (int i = 0; i < b.length; i++) { // コピー先配列内容の表示
        System.out.println(b[i]);
    }
    
    for (int i = 0; i < a.length; i++) { // 配列データのコピー
        b[i] = a[i];
    }
    
    for (int i = 0; i < b.length; i++) { // コピー先配列内容の表示
        System.out.println(b[i]);
    }
  }
}
