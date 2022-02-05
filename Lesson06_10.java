public class Lesson06_10 {
  public static void main(String[] args) {
    
    int totalListPrice = 0;

    for(int i = 0; i < args.length; i++) {
      totalListPrice += Integer.parseInt(args[i]);
    }
    System.out.println(totalListPrice);

    int totalTaxPrice = calcTaxPrice(totalListPrice);
    System.out.println(totalTaxPrice);

    int payPrice = discount(totalTaxPrice);
    System.out.println(payPrice);

    System.out.println("PayPrice: " + payPrice);
  }

  static int calcTaxPrice(int totalListPrice) {
    return (int)(totalListPrice * 1.08);
  }

  static int discount(int totalTaxPrice) {
    if(1000 <= totalTaxPrice && totalTaxPrice < 5000) {
      return (int)(totalTaxPrice - (totalTaxPrice * 0.1));
    } else if(5000 <= totalTaxPrice) {
      double num = totalTaxPrice * 0.2;
      if (num > 5000){
        return (int)(totalTaxPrice - 5000);
      } else {
        return (int)(totalTaxPrice - num);
      }
    } else {
      return totalTaxPrice;
    }
  }
}
