public class Q3 {
  public static void main(String[] args) {
    for(int i = 1; i < 1000000; i++) {
      double num = 0;
      for(int j = 1; j < i; j++) {
        num += (double)1 / j;
      }
      if(num >= 10){
        System.out.println(num);
        break;
      }
    }
  }
}
