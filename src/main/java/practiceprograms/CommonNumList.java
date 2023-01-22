package practiceprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonNumList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("11");
        List<String> temp = new ArrayList<String>(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("11");
        list2.add("33");
        list2.add("3");
        list2.add("4");

        Set<String> set = new HashSet<>(temp);
        Set<String> set1 = new HashSet<>(list2);

        Set<String > com = new HashSet<>();
        com.addAll(set);
        com.addAll(set1);
        System.out.println("Common:" +com);

        list1.removeAll(list2);
        list2.removeAll(temp);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(temp);
        temp.clear();

        temp.addAll(list1);
        temp.addAll(list2);
        System.out.println("Uncommon:" +temp);

    }
}
