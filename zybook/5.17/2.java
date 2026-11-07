import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        int numWords = scnr.nextInt();
        
        String[] words = new String[numWords];
        int[] frequencies = new int[numWords];
        
        for (int i = 0; i < numWords; ++i) {
            words[i] = scnr.next();
        }
        
        for (int i = 0; i < numWords; ++i) {
            int count = 0;
            for (int j = 0; j < numWords; ++j) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            frequencies[i] = count;
        }
        
        for (int i = 0; i < numWords; ++i) {
            System.out.println(words[i] + " - " + frequencies[i]);
        }
        
        scnr.close();
    }
}
