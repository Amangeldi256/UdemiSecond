package functional;

import java.util.List;

public class FPNumberRun {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,8,9,13,3,15);
        int sum = fpSum(numbers);
        int sum1 = fpSum1(numbers); 
        
        System.out.println(sum);
        System.out.println(sum1);
    }
    private static int fpSum1(List<Integer> numbers) {
        return numbers.stream()
        .reduce(0, (number1, number2) -> {
            System.out.println(number1 + " + " + number2);
            return number1 + number2;}
            );
    }

    private static int fpSum(List<Integer> numbers) {
        int sum = numbers.stream().
        filter(number -> number%2 == 1).reduce(0, 
        (number1, number2) -> number1 + number2);
        return sum;
    }


    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
