import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Zgjedh algoritmin:");
        System.out.println("1. Book Cipher");
        System.out.println("2. Route Transposition");
        int algChoice = sc.nextInt();
        sc.nextLine();

        System.out.println("Zgjedh veprimin:");
        System.out.println("1. Enkriptim");
        System.out.println("2. Dekriptim");
        int action = sc.nextInt();
        sc.nextLine();

        switch (algChoice) {
            case 1:
                BookCipher bookCipher = new BookCipher();
                if (action == 1) {
                    System.out.println("Shkruaj mesazhin për enkriptim:");
                    String msg = sc.nextLine();
                    String encrypted = bookCipher.encrypt(msg);
                    System.out.println("Enkriptuar: " + encrypted);
                } else {
                    System.out.println("Shkruaj tekstin për dekriptim:");
                    String msg = sc.nextLine();
                    String decrypted = bookCipher.decrypt(msg);
                    System.out.println("Dekriptuar: " + decrypted);
                }
                break;

            case 2:
                RouteTransposition route = new RouteTransposition();
                if (action == 1) {
                    System.out.println("Shkruaj mesazhin për enkriptim:");
                    String msg = sc.nextLine();
                    String encrypted = route.encrypt(msg);
                    System.out.println("Enkriptuar: " + encrypted);
                } else {
                    System.out.println("Shkruaj tekstin për dekriptim:");
                    String msg = sc.nextLine();
                    String decrypted = route.decrypt(msg);
                    System.out.println("Dekriptuar: " + decrypted);
                }
                break;

            default:
                System.out.println("Zgjedhje e pavlefshme!");
        }
        sc.close();
    }
}
