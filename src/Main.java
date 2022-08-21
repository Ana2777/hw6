import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            String a = Arrays.toString(arr);
            System.out.println(a);
            System.out.println(Arrays.toString(arr));
        }
//Задание 1
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + s + " рублей");
// Задание 2
        int min = Integer.MAX_VALUE;
        for (int wastesValueMin : arr) {
            if (min  > wastesValueMin);{
            min = wastesValueMin;}}
            System.out.println("Минимальная сумма трат за день составила " + min +" рублей.");

        int max = Integer.MIN_VALUE;
        for (int wastesMaxValue : arr) {
            if (max < wastesMaxValue);{
                max = wastesMaxValue;}}
        System.out.println("Максимальная сумма трат за день составила " + max +" рублей.");


        // Задание 3
                double average = s/arr.length;
                System.out.println("Средняя сумма трат за месяц составила " + average + "0 рублей");
// Задание 4
                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int d = reverseFullName.length - 1; d >= 0; d--) {
                    System.out.print(reverseFullName[d]);
                }
            }
        }
