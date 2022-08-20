import java.util.Arrays;
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
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]);
        }
        System.out.println("Минимальная сумма трат за день составила " + arr[min] + " рублей.");
        System.out.println(" ");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) ;
        }
            System.out.println("Максимальная сумма трат за день составила " + arr[max] + " рублей.");
        System.out.println(" ");
// Задание 3
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i] / arr.length;
        }
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
// Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int d = reverseFullName.length - 1; d >= 0; d--) {
            if (d == 0) {
                System.out.print(reverseFullName[d]);
            } else {
                System.out.print(reverseFullName[d]);
            }
        }

    }

        }

