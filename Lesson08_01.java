class Lesson08_01 {
  public static void main(String[] args) {
    // 配列（宣言と代入を別々にしたもの）
    String[] arr; //配列変数名
    arr = new String[3]; //カッコ内に要素数

    arr[0] = "sato";
    arr[1] = "suzuki";
    arr[2] = "takagashi";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}