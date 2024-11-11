package SetCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RunnerMap {
    public static void main(String[] args) {
       /*  
       Map<String, Integer> map = Map.of("A", 3, "S", 5, "B", 7);
        System.out.println(map); 
        System.out.println(map.containsKey("B")+  " " + map.keySet());
        System.out.println(map.values());
        Map<String, Integer> hashMap = new HashMap<>(map);
        System.out.println(hashMap);
        hashMap.put("R", 10);
        System.out.println(hashMap);
*/

       /*  HashMap<String, Integer> mapHash1 = new HashMap<>();
        mapHash1.put("D", 6);
        mapHash1.put("J", 5);
        mapHash1.put("A", 75);
        mapHash1.put("S", 10);
        System.out.println(mapHash1);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("D", 6);
        linkedHashMap.put("J", 5);
        linkedHashMap.put("A", 75);
        linkedHashMap.put("S", 10);

        System.out.println(linkedHashMap);

        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("D", 6);
        treeMap1.put("J", 5);
        treeMap1.put("A", 75);
        treeMap1.put("S", 10);

        System.out.println(treeMap1);
*/
        String str = "This is an awesome occasion. " + "This has never happened befor";
        Map<Character, Integer> occurances = new HashMap<>();
        char[] characters = str.toCharArray();

        for (char character:characters) {
            Integer integer = occurances.get(character);
            if(integer == null) {
                occurances.put(character, 1);
            }else {
                occurances.put(character, integer + 1);
            }
        }
        System.out.println(occurances);

        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = str.split(" ");

        for(String word:words) {
            Integer integer = stringOccurances.get(word);

            if(integer == null) {
                stringOccurances.put(word, 1);
            }else {
                stringOccurances.put(word, integer + 1);
            }
        }

        System.out.println(stringOccurances);


        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("F", 12);
        treeMap2.put("M", 78);
        treeMap2.put("A", 19);
        treeMap2.put("J", 9);
        treeMap2.put("Z", 24);
        System.out.println(treeMap2);
        System.out.println(treeMap2.higherKey("J"));
        System.out.println(treeMap2.higherKey("M"));
        System.out.println(treeMap2.higherKey("Z"));
        System.out.println(treeMap2.ceilingKey("J"));
        System.out.println(treeMap2.lowerKey("J"));
        System.out.println(treeMap2.floorKey("J"));
        System.out.println(treeMap2.firstEntry()+ " " + treeMap2.lastEntry());
        System.out.println(treeMap2.subMap("C", "T"));

        
    }
}
