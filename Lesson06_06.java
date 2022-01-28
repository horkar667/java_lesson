public class Lesson06_06 {
  public static void main(String[] args) {
    String x = "100";
    Integer y = Integer.parseInt(x); //文字列をint型にするメソッド
    boolean result1 = y instanceof Integer;
    System.out.println(result1);

    int a = 100;
    String b = String.valueOf(a); //整数をString型にするメソッド
    boolean result2 = b instanceof String;
    System.out.println(result2);

    // キャスト
    long c = 200L;
    Integer d = (int)c; //キャスト演算子を行うと一時的な型変換が可能
    boolean result3 = d instanceof Integer;
    System.out.println(result3);
  }
}
