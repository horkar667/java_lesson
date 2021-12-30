package Algorithms;
class Algorithm {
  public static void main(String[] args) {
    int[] arr = {68, 55, 72, 93, 87};
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    int[] x;
    x = new int[5];
    int min = 0;
    int num = arr[0];
    for(int i = 0; i < arr.length; i++) {
      for(int y = 0; y < arr.length; y++) {
        min = arr[i];
        num = 0;
        if(min > arr[y]){
          min = arr[y];
          num = y;
        }
      }
      x[num] = arr[i];
    }
    System.out.println("");
    for(int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
  }
}