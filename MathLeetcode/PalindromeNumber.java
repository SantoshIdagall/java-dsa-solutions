package MathLeetcode;

public class PalindromeNumber {

    public static boolean ispalindrome(int num){
        if(num < 0) return false;
        int orgnum = num;

        int rev= 0;
        while (num > 0) {
             int digit= num%10;
             rev = rev*10 + digit;
             num/=10;
             
        }
         return orgnum == rev;
    }
  public static void main(String[] args) {
    int num =  121;
     System.out.println(ispalindrome(num));
  }

}
