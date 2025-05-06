package core.java.training.datastructure.treemap;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String [] args){
        TreeMap<String, Integer>evenNumber=new TreeMap<>();
        evenNumber.put("Two",2);
        evenNumber.put("Six",6);
        evenNumber.put("Eight",8);
        evenNumber.put("Four",4);
        evenNumber.put("Ten",10);
        evenNumber.putIfAbsent("Zero",0);
        System.out.println("Even Numbers in TreeMap"+ evenNumber);

        TreeMap<String, Integer>oddNumber=new TreeMap<>();
        oddNumber.put("One",1);
        oddNumber.put("Three",3);
        oddNumber.put("Eleven",11);

        oddNumber.putAll(evenNumber);
        System.out.println("After adding the map is -->"+oddNumber);
        System.out.println(oddNumber.keySet());
        System.out.println(oddNumber.values());
        System.out.println(oddNumber.get("Five"));
        System.out.println(oddNumber.getOrDefault("Eleven",11));
        System.out.println(oddNumber.floorKey("Three"));
        System.out.println(oddNumber.firstKey());
        System.out.println(oddNumber.lastKey());
        System.out.println(oddNumber.subMap("Eight","Zero"));

    }
}
