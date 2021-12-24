public class Q2 {
  public static void main(String[] args) {
    int num = 0;
    for(int i = 1; i <= 20000000; i++){
      if(1234567890 % i == 0) {
        num += i;
        // System.out.println(num);
      }
    }
    System.out.println(num);
  }
}
