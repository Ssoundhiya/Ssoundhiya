package practiceprograms;

public class SwappingNum {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Before Swapping:"+"a="+a+ " "+ "+b="+b);
        a = a+b; // a=5
        b = a-b; // b=2
        a = a-b; // a=3
        System.out.println("After Swapping:"+"a="+a+ " "+ "+b="+b);
    }
}
