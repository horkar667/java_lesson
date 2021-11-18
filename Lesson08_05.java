class Lesson08_05 {
  public static void main(String[] args) {
    // 多次元配列（配列の宣言と共にデータ代入）
    String[][] arr = { { "sato", "suzuki" }, { "takahashi", "tanaka" } };
    arr[0][1] = "kondo";
    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
  }
}
