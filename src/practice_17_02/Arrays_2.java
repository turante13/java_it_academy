package practice_17_02;

public class Arrays_2 {
    public static void main(String[] args){
        int rows = 5;
        int columns = 10;
        char[][] drawing = new char[rows][columns];
// Populate the array with characters to create the drawing
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows-1 || j == 0 || j == columns-1) {
                    // Draw the border of the drawing
                    drawing[i][j] = '#';
                } else if (i == j) {
                    // Draw a diagonal line from top-left to bottom-right
                    drawing[i][j] = '0';
                } else if (i == rows-j-1) {
                    // Draw a diagonal line from top-right to bottom-left
                    drawing[i][j] = '0';
                } else {
                    // Draw empty spaces inside the border
                    drawing[i][j] = ' ';
                }
            }
        }
// Display the drawing in the console
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(drawing[i][j]);
            }
            System.out.println();
        }

    }
}
