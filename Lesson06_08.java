public class Lesson06_08 {
  public static void main(String[] args) {
    
    int[][] rooms = {{101, 102, 103},{201, 202, 203},{301, 302, 303}};

    System.out.println("rooms: " + rooms);      //場所情報が表示される

    String name = "takumi";

    boolean check1 = name == args[0];           //場所情報が異なるためfalse
    System.out.println("check1: " + check1);

    boolean check2 = name.equals(args[0]);      //基本的にはメソッドを使う
    System.out.println("check3: " + check2);

    String nameOfficial1 = new String("takumi"); //正式な作られ方をしたString型変数
    String nameOfficial2 = new String("takumi"); //正式な作られ方をしたString型変数
    String nameGizi1 = "takumi";                 //疑似プリミティブな作られ方をしたString型変数
    String nameGizi2 = "takumi";                 //疑似プリミティブな作られ方をしたString型変数

    boolean check3 = nameOfficial1 == nameOfficial2;
    System.out.println("check3: " + check3);

    boolean check4 = nameGizi1 == nameOfficial1;
    System.out.println("check4: " + check4);

    boolean check5 = nameGizi1 == nameGizi2;
    System.out.println("check5: " + check5);
  }
}
