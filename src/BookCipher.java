import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class BookCipher {
    static Scanner sc=new Scanner(System.in);
    // "Libri" si tekst referues
    private static List<String> bookWords = new ArrayList<>();
    // Lexon fjalët nga file dhe i shton në listë
    public static void loadBookFromFile(String filePath) {
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                bookWords.add(word.toLowerCase()); // për uniformitet
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
    public static String decrypt(List<Integer> cipher) {
        StringBuilder message = new StringBuilder();
        for (int index : cipher) {
            if (index >= 0 && index < bookWords.size()) {
                message.append(bookWords.get(index)).append(" ");
            } else {
                message.append("? ");
            }
        }
        return message.toString().trim();
    }
}
