package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("JAVA");
        list.add("World");

        System.out.println("list : "+ list);

        list.add(2,"Script");
        System.out.println("list : "+ list);

        list.set(1,"C");
        System.out.println("list : "+ list);

        System.out.println("list get(2) : "+ list.get(2));
    }
}
