import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text;
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();

        System.out.println(sword(text));

    }
    public static String sword(String text) {

        int start = 0;
        int number = 0;

        StringBuilder stringBuilder = new StringBuilder();

        while (start < text.length()) {
            int end = text.indexOf(' ', start);
            if (end < 0) {
                end = text.length();
            }
            String word = text.substring(start, end);
            start = end + 1;
            number++;
            stringBuilder.append(" (").append(number).append(") ").append(word);
        }
        return stringBuilder.toString().trim();
    }


}