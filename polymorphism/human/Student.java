package polymorphism.human;

public class Student extends Human {
  private int score;

  public Student(String name, int age, int score) {
    super(name, age);
    this.score = score;
  }

  @Override // オーバーライドの条件を満たしていないと、コンパイルエラーを出してくれる
  public String getProfile() {
    String profile = "年齢は" + super.age + "です。";
    profile += "学生で、テストの点数は" + this.score + "点です。";
    return profile;
  }
}
