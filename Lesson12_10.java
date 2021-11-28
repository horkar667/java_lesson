class Lesson12_10 {
  public static void main(String[] args) {
    Person2 person1 = new Person2("kate", "jones", 27, 1.6, 50.0, "医者");
    person1.printData();

    Person2 person2 = new Person2("john", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    
    person1.setJob("獣医");

    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");

    person1.printData();
  }
}
