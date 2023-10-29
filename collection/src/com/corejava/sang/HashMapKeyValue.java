//Q.2)How do you add given key-value pair to HashMap if and only if it is not present in the HashMap?(ProductName and cost pair)minimum six values

package com.corejava.sang;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapKeyValue {
 public static void main(String[] args) {
     // Creating HashMap with default initial capacity and load factor
     HashMap<String,Integer> map = new HashMap<String,Integer>();

     // Adding key-value pairs
     map.put("Product A", 856);
     map.put("Product B", 302);
     map.put("Product C", 254);
     map.put("Product D", 560);

     // Adds key-value pair only if it is not present in the map
     map.putIfAbsent("Product E", 580);
     map.putIfAbsent("Product F", 452);

     // Printing key-value pairs of the map
     Set<Entry<String, Integer>> entrySet = map.entrySet();

     for (Entry<String, Integer> entry : entrySet) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     }
 }
}