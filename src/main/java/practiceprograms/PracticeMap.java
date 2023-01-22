package practiceprograms;

import java.util.HashMap;
import java.util.HashSet;

public class PracticeMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vishal",10);
        map.put("Sachin",20);
        map.put("Vaibhav",30);
        System.out.println("Size of map:"+map.size());
        System.out.println(map);

        if (map.containsKey("Sach")){
            Integer a = map.get("Vishal");
            System.out.println("Value of key:"+a);
        }else System.out.println("Not Present");
    }
}
