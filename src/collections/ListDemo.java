package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.trimToSize();


        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 2){
                iterator.remove();
            }
        }

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Levon");
        linkedList.add("Levon");
        linkedList.add("Garik");

        String s = linkedList.get(2);
        System.out.println(s);

    }
}
