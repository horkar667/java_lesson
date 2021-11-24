import java.util.Scanner;

class Lesson12_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //Scannerの初期化

    System.out.print("名前：　");
    String name = scanner.next(); //文字列の入力を受け取る
    System.out.println("あなたの名前は" + name + "です");

    System.out.print("年齢：　");
    int age = scanner.nextInt();  //整数を受け取る
    
    System.out.print("体重：　");
    double weight = scanner.nextDouble(); //少数を受け取る

    System.out.println("あなたの年齢は" + age + "歳です");
    System.out.println("あなたの体重は" + weight + "kgです");
  }
}
