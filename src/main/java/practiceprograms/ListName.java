package practiceprograms;

import java.util.ArrayList;

public class ListName {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ramesh");
        list1.add("Mahesh");
        list1.add("Mahesh");
        list1.add("Rekha");
        list1.add("Suneeta");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        for (String str : list1){
            if(list2.contains(str)==false){
                list2.add(str);
            }
        }
        System.out.println(list2);
    }
}
