import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numWords = scnr.nextInt();
        String[] words = new String[20];

        for (int i = 0; i < numWords; i++) {
            words[i] = scnr.next();
        }

        char target = scnr.next().charAt(0);

        for (int i = 0; i < numWords; i++) {
            if (words[i].indexOf(target) >= 0) {
                System.out.print(words[i] + ",");
            }
        }

        System.out.println();
        scnr.close();
    }
}
