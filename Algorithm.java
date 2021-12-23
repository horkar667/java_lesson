class Algorithm {
  public static void main(String[] args) {
    int[] arr = {68, 55, 72, 93, 87};
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    int[] x;
    x = new int[5];
    int min = 0;
    int max = 0;
    for(int i = 0; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    for(int i = 0; i < arr.length; i++) {
      for(int y = 0; y < arr.length; y++) {
        if(min < arr[y] && arr[y] < max) {
          min = arr[y];
        } else if(max == arr[i]) {
          min = max;
        }
        x[i] = min;
      }
    }
    System.out.println("");
    for(int i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
  }
}