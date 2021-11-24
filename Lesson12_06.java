class Lesson12_06 {
  // 他のクラスのメソッドを呼び出す
  public static void main(String[] args) {
    Person.printData(Person.fullName("Kate", "Jones"), 27);

    Person.printData(Person.fullName("John", "Christopher", "smith"), 65);
  }
}
