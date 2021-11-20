class Lesson11_04 {
  public static void main(String[] args) {
    // for文のネスト
    for(int i = 0; i <= 2; i++) {
      for(int j = 0; j <= 2; j++){
        System.out.println( i + "-" + j );
      }
    }
  }
}
// 0-0
// 0-1
// 0-2
// 1-0
// 1-1
// 1-2
// 2-0
// 2-1
// 2-2