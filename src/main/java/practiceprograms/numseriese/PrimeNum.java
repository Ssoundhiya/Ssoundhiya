package practiceprograms.numseriese;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 1;
        int m;
        for (int i=1;i<=num;i++) {
            m=num%i;
            if (m==0){
                System.out.print(" "+m);
            }
            //Output : 2 3 5 7 13 17 19.......
        }
        }
}
