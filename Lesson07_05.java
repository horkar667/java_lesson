class Lesson07_05 {
  public static void main(String[] args) {
    // 自動型変換
    System.out.println("佐藤さんは" + 23 + "歳です"); //文字列がある場合int型がString型に変換される

    System.out.println(5.0 / 2);

    // 強制型変換
    int number1 = 13;
    int number2 = 4;
    System.out.println((double)number1 / number2);
    //int型の場合は少数が表示されないが、どちらか片方をdouble型にキャストすれば、double型で出力される
  }
}
