package graphs2;

//file 3

public class floodfill {

    public static void floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor != newColor) {
            fill(image, sr, sc, originalColor, newColor);
        }
    }

    private static void fill(int[][] image, int sr, int sc, int originalColor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, originalColor, newColor);
        fill(image, sr + 1, sc, originalColor, newColor);
        fill(image, sr, sc - 1, originalColor, newColor);
        fill(image, sr, sc + 1, originalColor, newColor);
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        floodFill(image, sr, sc, newColor);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
