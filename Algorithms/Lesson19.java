package Algorithms;

public class Lesson19 {
  public static void main(String[] args) {
    String[] a = {"abc", "abcd", "abcde", "xx", "yyy"};
        
    String key = "abcde"; // 探索キー（見つかる場合）
    //String key = "ab"; // 探索キー（見つからない場合）
    
    int i; // カウンタ変数（＝見つかった要素の添字）
    for (i = 0; i < a.length; i++) { // 探索ループ
        if (a[i].equals(key)) { // 文字列の場合に使うequalsメソッド”＝＝”という意味
            break;
        }
    }
    
    if (i < a.length) { // 見つかったか
        System.out.println(i);
    } else {
        System.out.println("Not found");
    }
  }
}
