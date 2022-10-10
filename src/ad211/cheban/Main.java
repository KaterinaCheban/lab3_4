package ad211.cheban;

import java.util.Scanner;
import java.util.Arrays; /* класс с большим набором статических методов,
предназначенных для выполнения некоторых стандартных операций */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть речення: ");
        String line = in.nextLine();
        String[] words = line.split(" ");
        System.out.print("Слова з вашого речення: " + Arrays.toString(words));
    }
}