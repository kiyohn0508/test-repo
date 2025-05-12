package collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        System.out.println("map.size() :" + map.size());

        map.put(5, "Hello");
        map.put(6, "Java");
        map.put(7, "World");

        System.out.println("map :" + map);
        System.out.println("map.size() :" + map.size());

        map.put(6, "C");
        System.out.println("map :" + map);

        map.put(8, "!!!");
        System.out.println("map :" + map);

        map.remove(8);
        System.out.println("map :" + map);
    }
    
}
