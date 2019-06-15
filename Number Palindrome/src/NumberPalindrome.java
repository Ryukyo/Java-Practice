public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int temporary = number;
        while (temporary != 0) {
           int lastDigit = temporary % 10;
           reverse = reverse * 10 + lastDigit;
           temporary /= 10;
        }


         if (number == reverse) {
            return true;
        }
         return false;
    }
}
