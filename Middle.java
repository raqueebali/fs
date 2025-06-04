class Middle{
// public static void main(String[] args) {
//     int number =12345678910; 
//     String strNumber = Integer.toString(number); 
//     int middle = strNumber.length() / 2; 
//     String middleDigits = "";
//     if (strNumber.length() % 2 == 0) { 
//         middleDigits = strNumber.substring(middle - 1, middle + 1);
//     } else { // if the number has an odd number of digits
//         middleDigits = strNumber.substring(middle, middle + 1);
//     }
//     System.out.println("Middle digit(s) of " + number + ": " + middleDigits);
// }

    public static void main(String[] args) {
      String input = "12345678910";
      int length = input.length();
      int middleIndex = length / 2;
      char middleChar = input.charAt(middleIndex);
      int middleNum = Character.getNumericValue(middleChar);
  
      System.out.println("Middle number: " + middleNum);
    }
  
  
}