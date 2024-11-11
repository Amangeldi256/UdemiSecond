package SetCourse;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRun {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Bango");
       // queue.offer("Tea");

        queue.addAll(List.of("Zebra","Apple","Donkey",  "Cat", "Monkey"));
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println(queue.poll());


    }
}
