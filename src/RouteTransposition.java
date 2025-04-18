public class RouteTransposition {
    public static String encrypt(String plaintext) {

        int length = plaintext.length();
        int rows = (int) Math.ceil(Math.sqrt(length));
        int cols = (int) Math.ceil((double) length / rows);

        char[][] grid = new char[rows][cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = (index < length) ? plaintext.charAt(index++) : 'X';
            }
        }

        StringBuilder ciphertext = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                ciphertext.append(grid[i][j]);
            }
        }

        return ciphertext.toString();
    }
    public static String decrypt(String message) {
        return "Kodi ende nuk eshte implementuar.";
    }
}
