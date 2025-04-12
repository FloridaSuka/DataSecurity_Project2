import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int algChoice = 0;

        while(true) {
            if (algChoice == 0) {
                System.out.println("\nZgjedh algoritmin:");
                System.out.println("1. Book Cipher");
                System.out.println("2. Route Transposition");
                algChoice = sc.nextInt();
                sc.nextLine();

                if (algChoice != 1 && algChoice != 2) {
                    System.out.println("❌ Zgjedhje e pavlefshme për algoritmin!");
                    algChoice = 0;
                    continue;
                }
            }

            System.out.println("\nZgjedh veprimin:");
            System.out.println("1. Enkriptim");
            System.out.println("2. Dekriptim");
            int action = sc.nextInt();
            sc.nextLine();

            if (action != 1 && action != 2) {
                System.out.println("❌ Zgjedhje e pavlefshme për veprimin!");
                continue;
            }

            switch (algChoice) {
                case 1:
                    System.out.println("\n--📖 Book Cipher--");
                    BookCipher bookCipher = new BookCipher();
                    if (action == 1) {
                        System.out.println("Shkruaj mesazhin për enkriptim:");
                        String msg = sc.nextLine();
                        String encrypted = bookCipher.encrypt(msg);
                        System.out.println("🔐 Enkriptuar: " + encrypted);
                    } else {
                        System.out.println("Shkruaj tekstin për dekriptim:");
                        String msg = sc.nextLine();
                        String decrypted = bookCipher.decrypt(msg);
                        System.out.println("🔓 Dekriptuar: " + decrypted);
                    }
                    break;

                case 2:
                    System.out.println("\n--🚗 Route Transposition--");
                    RouteTransposition route = new RouteTransposition();
                    if (action == 1) {
                        System.out.println("Shkruaj mesazhin për enkriptim:");
                        String msg = sc.nextLine();
                        String encrypted = route.encrypt(msg);
                        System.out.println("🔐 Enkriptuar: " + encrypted);
                    } else {
                        System.out.println("Shkruaj tekstin për dekriptim:");
                        String msg = sc.nextLine();
                        String decrypted = route.decrypt(msg);
                        System.out.println("🔓 Dekriptuar: " + decrypted);
                    }
                    break;
            }

            System.out.println("\n➕ Çfarë dëshiron të bësh tani?");
            System.out.println("1. Vazhdo me të njëjtin algoritëm");
            System.out.println("2. Ndërro algoritmin");
            System.out.println("3. Mbyll programin");

            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                continue;
            } else if (option == 2) {
                algChoice = 0;
                continue;
            } else if (option == 3) {
                System.out.println("🔚 Programi u mbyll. Faleminderit!");
                break;
            } else {
                System.out.println("⚠️ Zgjedhje e pavlefshme. Programi po mbyllet.");
                break;
            }
        }

        sc.close();
    }
}
