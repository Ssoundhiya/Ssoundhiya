package practiceprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListSet {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //Set<String> list1 = new HashSet<>();
        list1.add("Ramesh");
        list1.add("Mahesh");
        list1.add("Mahesh");
        list1.add("Rekha");
        list1.add("Suneeta");
        System.out.println(list1);
        Set<String> set = new HashSet<>();

        for (String str: list1){
            if (set.add(str)==false){
                System.out.println(str);
            }
        }
    }
}
