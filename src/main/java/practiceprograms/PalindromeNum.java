package practiceprograms;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 656;
        int r;
        int sum = 0;
        int temp = num;
        while (num>0){
            r=num%10;
            num = num/10;
            sum = (sum*10)+r;
        }
        if(temp==sum){
            System.out.println("Number is Palindrome");
        }else
            System.out.println("Number is Not Palindrome");
    }
}
