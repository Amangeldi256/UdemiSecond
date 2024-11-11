package colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Kanat"), 
                                        new Student(100, "Ranga"), 
                                        new Student(33, "Eva"),
                                        new Student(51, "Adam"));

        ArrayList<Student> studentsAll = new ArrayList<>(students);

       // System.out.println(students);

       // Collections.sort(studentsAll);
        
        System.out.println(studentsAll);


        Collections.sort(studentsAll);
        System.out.println("Asc " + studentsAll);

        Collections.sort(studentsAll, new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator " + studentsAll);

    }
}
