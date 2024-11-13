package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generic {

    static<X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void dublicate(X list) {
        list.addAll(list);
    }

        /* 
        static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
      }  
        */    
        static void addCoupleOfValues(List<? super Number> numbers) {
            numbers.add(1);
            numbers.add(1.0);
            numbers.add(1.0f);
            numbers.add(1l);
        }

    
    public static void main(String[] args) {
        List emptyList4 = new ArrayList<Number>();
        addCoupleOfValues(emptyList4);
        System.out.println(emptyList4);
        /*System.out.println(sumOfNumberList(List.of(1,2,3,4, 5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1, 5.1)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l, 5l)));/* */
        String value1 = doubleValue(new String());
        Integer number1 = doubleValue(Integer.valueOf(8));
        ArrayList list1 = doubleValue(new ArrayList<>()); 

       // ArrayList number3s = new ArrayList<>(List.of(1, 2,3));
        LinkedList<Integer> number3s = new LinkedList<>(List.of(1, 2,3));
        dublicate(number3s);
        System.out.println(number3s);

        doubleValue(new String());
        doubleValue(Integer.valueOf(5));
        doubleValue(new ArrayList<>());

        Example<Car, String> cars = new Example<>();
        String vs1 = " Конечно этот код.";
        Car car1 = new Car("Bmw", 2020);
        Car car2 = new Car("Toyota", 2018);
        Car car3 = new Car("Volvo", 2016);
        cars.addToString(car1, vs1);
        cars.addToString(car2, vs1);
        cars.addToString(car3, vs1);

        System.out.println(cars.getString());


     /* Example<Integer> str = new Example<>();
        str.addToString(1);
        str.addToString(2);
        str.addToString(3);
        System.out.println(str.getString());
     */

        MyCustomList<String> myCustomList1 = new MyCustomList<>();
        myCustomList1.addElement("Element1");
        myCustomList1.addElement("Element2");
        String value = myCustomList1.get(0);
        
        System.out.println(myCustomList1);
        System.out.println(value);
       
        MyCustomList<Integer> myCustomList2 = new MyCustomList();
        myCustomList2.addElement(Integer.valueOf(5));
        myCustomList2.addElement(Integer.valueOf(7));
        Integer num = myCustomList2.get(0);
        System.out.println(myCustomList2);
        System.out.println(num);
    }
}
