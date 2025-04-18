import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class BookCipher {
    static Scanner sc=new Scanner(System.in);
    private static List<String> bookWords = new ArrayList<>();
    public static void loadBookFromFile(String filePath) {
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNext()) {
                String word = fileScanner.next()
                        .toLowerCase()
                        .replaceAll("[^a-z0-9]", "");
                if (!word.isEmpty()) {
                    bookWords.add(word);
                }
            }
            fileScanner.close();
            System.out.println("Libri u ngarkua me sukses!");
        } catch (FileNotFoundException e) {
            System.out.println("File nuk u gjet: " + filePath);
            System.exit(1);
        }
    }
    public String encrypt(String message) {
        return "Kodi ende nuk eshte implementuar.";
    }
    // Deshifron indekset në fjalë nga libri
    public static String decrypt(List<Integer> cipher, boolean firstLetterOnly) {
        StringBuilder message = new StringBuilder();
        for (int index : cipher) {
            int trueIndex = index - 1; // konvertim nga 1-based në 0-based
            if (trueIndex >= 0 && trueIndex < bookWords.size()) {
                String word = bookWords.get(trueIndex);
                if (firstLetterOnly && !word.isEmpty()) {
                    message.append(word.charAt(0)); // vetëm shkronja e parë
                } else {
                    message.append(word).append(" ");
                }
            } else {
                message.append("[?] ");
            }
        }

        return message.toString().trim();
    }

}