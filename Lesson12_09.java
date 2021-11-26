import java.util.Scanner;

class Lesson12_09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("何人文の情報を入力しますか：");
    int num = scanner.nextInt();
    int maxAge = 0;
    int totalAge = 0;

    for (int i = 0; i < num; i++) {
      System.out.println(i + 1 + "人目");

      System.out.print("名前：");
      String firstName = scanner.next();

      System.out.print("名字：");
      String lastName = scanner.next();

      System.out.print("年齢：");
      int age = scanner.nextInt();

      System.out.print("身長(m)：");
      double height = scanner.nextDouble();

      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      Person1.printData(firstName, lastName, age, height, weight);

      if (age > maxAge) {
        maxAge = age;
      }
      totalAge += age;
    }
    System.out.println("最高年齢は" + maxAge + "歳です");
    System.out.println("平均年齢は" + Person1.averageAge(num, totalAge) + "歳です");
  }
}