class Lesson11_03 {
  public static void main(String[] args) {
    // continue文
    for (int i = 0; i <= 4; i++) {
      if (i == 3) {
        continue; //iが３の時処理をスキップ
      }
      System.out.println(i);
    }
  }
}
