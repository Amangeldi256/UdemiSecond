package Listen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        System.out.println("Hello WIN");
        List<String> works = List.of("Can", "Mane", "Go", "Ran");
        //works.add("B512");
      

      /* for (int i = 0; i < works.size(); i++) {
            System.out.println(works.get(i));
        } */ 

      /*  Iterator iterWorks = works.iterator();
        while(iterWorks.hasNext()) {
            System.out.println(iterWorks.next());
        }*/

       /* for(String work : works) {
            if(work.endsWith("an")){
               System.out.println(work); 
            } 
        }*/
       /* for (String work : works) {
            System.out.println(work);
        }*/

        List<String> workAll = new ArrayList<>(works);

        Iterator<String> iterator = workAll.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().endsWith("an")) {
                iterator.remove();
            }
        }

        for(String work : workAll) {
            System.out.println(work);
        } 
        List<Integer> number = List.of(11, 101, 52, 163, 15);

        List<Integer> numberAll = new ArrayList<>(number);

       // numberAll.remove(Integer.valueOf(103));

       Collections.sort(numberAll);



        for(Integer numbers : numberAll) {
            System.out.println(numbers);
        }




    }

}
