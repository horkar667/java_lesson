import java.lang.Math;  //外部ライブラリを呼び出す（java.lang.Mathに関してはよく利用されるため、実は、特別に自動で読み込まれている）

class Lesson12_07 {
  public static void main(String[] args) {
    double bmi = 1.6 * 50.0;
    System.out.println("BMIは" + Math.round(bmi) + "です"); // Math.round　で四捨五入

    int max = Math.max(3, 8);   //　Math.maxで二つの数値の大きい方を選んでくれる
    System.out.println("最大値は" + max + "です");
  }
}
