import java.awt.image.BufferedImage;

// check how different two images are
// Takes in two BufferedImages and returns a double that represents the % difference
public class PercentCalculator {

    // assumes the frames are the same size (which they should be)
    public static double compare(BufferedImage img1, BufferedImage img2) {
        int w1 = img1.getWidth();
        int h1 = img1.getHeight();

        double totalDiff = 0;
        //Color pixel1 = new Color();

        // i is x, j is y
        for (int j = 0; j < h1; j++) {
            for (int i = 0; i < w1; i++) {
                int pixel1 = img1.getRGB(i, j);
                PixelColor c1 = new PixelColor(pixel1);

                int pixel2 = img2.getRGB(i, j);
                PixelColor c2 = new PixelColor(pixel2);

                double difference = Math.abs(c1.r - c2.r) + Math.abs(c1.g - c2.g) + Math.abs(c1.b - c2.b);
                totalDiff += difference;
            }
        }
        // total number of pixels multiplied by 3 (r,g,b)
        // System.out.println("width " + w1 + "height " + h1);
        double normalized = totalDiff / (w1 * h1 * 3);
        double percent = (normalized/255) * 100;


        return percent;
    }
}

