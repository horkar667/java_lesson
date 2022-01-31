public class Lesson06_09 {
  public static void main(String[] args) {
    
    String[][] animals = {
      {"moko", "toy poodle   ", "4 years old", "female"},
      {"poti", "brushwood dog", "6 years old", "male"},
      {"mugi", "papillion    ", "2 years old", "male"},
      {"koro", "bulldog      ", "3 years old", "female"},
      {"siro", "Akita        ", "8 years old", "male"}
    };

    for(int i = 0; i < animals.length; i++){
      for(int j = 0; j < animals[i].length; j++){
        if(j == 3) {
          System.out.println(animals[i][j]);
        } else {
          System.out.print(animals[i][j] + " / ");
        }
      }
    }
  }
}
