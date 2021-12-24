public class Q1 {

  public static void main(String[] args) {
    int num = 0;
    int x = 0;
    for(int i = 1; i <= 64; i++) {
      num = (i * i * i * i);
      x += num;
    }
    System.out.println(x);
  }
}