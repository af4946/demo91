public class uc47 {
    public static void main(String[] args) {

        // Define the banner using 2D character array
        char[][] banner = {
            {'*','*','*',' ',' ',' ','*','*','*',' ',' ',' ','*','*','*',' ',' ',' ','*','*','*'},
            {'*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*'},
            {'*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*','*','*',' ',' ',' ','*',' ',' ','*'},
            {'*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ','*',' ',' ',' ',' ',' ','*',' ',' ','*'},
            {'*','*','*',' ',' ',' ','*','*','*',' ',' ',' ','*',' ',' ',' ',' ',' ','*','*','*'}
        };

        // Print the banner using loops
        for (int i = 0; i < banner.length; i++) {
            for (int j = 0; j < banner[i].length; j++) {
                System.out.print(banner[i][j]);
            }
            System.out.println();
        }
    }
}