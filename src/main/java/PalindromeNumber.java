public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int revarse = 0;
        if(x>=0) {
            while (x != 0) {
                int temp = x % 10;
                revarse = revarse * 10 + temp;
                x = x / 10;
            }
            if(originalNum == revarse)
                return  true;
            else
                return false;
        }
        else
            return  false;

    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();
        boolean flag = obj.isPalindrome(6776);
        System.out.println("Given number is Palindrome: "+flag);
        if(flag){
            System.out.println(".....Well done.... ");
        }else {
            System.out.println("....Try again....");
        }

    }
}
