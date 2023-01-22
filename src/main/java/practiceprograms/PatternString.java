package practiceprograms;

import java.util.Scanner;

public class PatternString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = s.next();
        for (int i = 0; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
    }
}
