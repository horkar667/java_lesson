public class Lesson06_07 {
  public static void main(String[] args) {
    // コマンドライン引数の活用
    String x = args[0];
    String y = args[1];
    System.out.println(x + y);

    int input1 = Integer.parseInt(args[2]);
    int input2 = Integer.parseInt(args[3]);
    int input3 = Integer.parseInt(args[4]);
    System.out.println(input1 + input2 + input3);

    int count = args.length;
    System.out.println(count);

  }
}
