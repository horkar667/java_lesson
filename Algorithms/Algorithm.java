package Algorithms;
class Algorithm {
  public static void main(String[] args) {
    int[] arr = {68, 55, 72, 93, 87};
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    int[] x;
    x = new int[5];
    int min = 100;
    int num = 0;
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length; j++) {
        if(num < arr[j]){
          if(min > arr[j]) {
            min = arr[j];
          }
        }
      }
      num = min;
      x[i] = min;
      min = 100;
    }

    System.out.println("");
    for(int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
  }
}