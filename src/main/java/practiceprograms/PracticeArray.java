package practiceprograms;

public class PracticeArray {
    public static void main(String[] args) {
        int[] arr={1,2,43,67,97,455,675};
        int max = Integer.MIN_VALUE;
        for (int element:arr){
            if (element>max){
                max=element;
            }
        }
        System.out.println("Maximum element is:"+max);
    }
}
