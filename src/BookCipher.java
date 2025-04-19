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
            System.out.println("\uD83D\uDCDA Libri u ngarkua me sukses!");
        } catch (FileNotFoundException e) {
            System.out.println("File nuk u gjet: " + filePath);
            System.exit(1);
        }
    }
    
    public String encrypt(String message, boolean firstLetterOnly) {
        StringBuilder result = new StringBuilder();

        if (firstLetterOnly) {
            String cleaned = message.toLowerCase().replaceAll("[^a-z]", "");
            Map<Character, Integer> usageCount = new HashMap<>();

            for (char ch : cleaned.toCharArray()) {
                int count = usageCount.getOrDefault(ch, 0);
                int matchIndex = -1;
                int foundCount = 0;

                for (int i = 0; i < bookWords.size(); i++) {
                    String bookWord = bookWords.get(i);
                    if (!bookWord.isEmpty() && bookWord.charAt(0) == ch) {
                        if (foundCount == count) {
                            matchIndex = i + 1;
                            break;
                        }
                        foundCount++;
                    }
                }

                if (matchIndex != -1) {
                    result.append(matchIndex).append(" ");
                    usageCount.put(ch, count + 1);
                } else {
                    result.append("? ");
                }
            }
        } else {
            String[] words = message.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    int index = bookWords.indexOf(word);
                    if (index != -1) {
                        result.append(index + 1).append(" ");
                    } else {
                        result.append("? ");
                    }
                }
            }
        }

        return result.toString().trim();
    }

    // Deshifron indekset në fjalë nga libri
    public static String decrypt(List<Integer> cipher, boolean firstLetterOnly) {
        StringBuilder message = new StringBuilder();
        for (int index : cipher) {
            if (index == '\\') {
                message.append("\\");
                continue;
            }
            int trueIndex = index - 1;
            if (trueIndex >= 0 && trueIndex < bookWords.size()) {
                String word = bookWords.get(trueIndex);
                if (firstLetterOnly && !word.isEmpty()) {
                    message.append(word.charAt(0));
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