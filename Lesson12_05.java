class Lesson12_05 {
  public static void main(String[] args) {
    printData(1.6, 50.0);
  }

  public static void printData(double height, double weight){
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    System.out.println("BMIは" + bmi + "です");

    if (isHealthy(bmi)){  //trueかfalseか
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }
  // 真偽値の戻り値
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}

