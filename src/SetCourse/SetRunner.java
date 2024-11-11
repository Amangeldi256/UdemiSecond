package SetCourse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
       // System.out.println("Course");
       List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');


       Set<Character> treeSet = new TreeSet<>(characters);
       System.out.println("treeSet " + treeSet);

       Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
       System.out.println("linkedHashSet " + linkedHashSet);

       Set<Character> hashSet = new HashSet<>(characters);
       System.out.println("hashSet " + hashSet);

       TreeSet<Integer> numbers1 = new TreeSet<>(Set.of(65, 75, 54, 12, 84,29, 99, 10));
       System.out.println(numbers1);

       System.out.println("numbers1 floor " + numbers1.floor(40) + "  numbers1 lower  " + numbers1.lower(numbers1.floor(40)));

       System.out.println("number ceiling " + numbers1.ceiling(35) + " number higher" + numbers1.higher(numbers1.ceiling(35)));

       System.out.println("number subSet 20 or 80:  " + numbers1.subSet(20, 80));
       System.out.println("number headSet  " + numbers1.headSet(50) + " num tailSet " + numbers1.tailSet(50));

       System.out.println();

    }
}
