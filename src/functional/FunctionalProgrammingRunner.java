package functional;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Bat");
      //  printBasic(list);
      //  printWithFP(list);
      
        printFiltering(list);
        printWithFPfilter(list);
        List<Integer> integerListOne = List.of(6, 5, 7, 9, 10, 8);
     //   printInteger(integerListOne);
        printListers(integerListOne);

    }

    private static void printBasic(List<String> list) {
        for(String string : list) {
            System.out.println(string + "; ");
        }
    }

    private static void printListers(List<Integer> numPrintTwo) {
        numPrintTwo.stream().filter(
            elements -> elements%2 == 0).forEach(
                elements -> System.out.println(elements));
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
            element -> System.out.println(element + " :"));

    }

    private static void printInteger(List<Integer> inetgers) {
        inetgers.stream().forEach(element -> System.out.println(element + "sanio"));
    }

    private static void printFiltering(List<String> words) {
        for(String string : words) {
            if(string.endsWith("at")){
                System.out.println(string +" - at");
            }
        }
    }

    private static void printWithFPfilter(List<String> list) {
        list.stream().filter(elemnt -> elemnt.endsWith("at")).
                    forEach(element -> System.out.println(element + ";+ "));
    }

}
