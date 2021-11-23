class Lesson11_07 {
  public static void main(String[] args) {
    // switch文
    int number = 13;

    switch (number % 5) {
      case 0:
        System.out.println("大吉です");
        break;                        //　breakで終わらせないと次の処理も行われる
      case 1:
        System.out.println("中吉です");
        break;
      case 3:
        System.out.println("凶です");
        break;
      default:                        // それ以外の処理　elseと一緒
        System.out.println("吉です");
        break;
    }
  }
}