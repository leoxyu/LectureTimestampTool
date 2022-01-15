package main;


import java.awt.image.BufferedImage;

// check how different two images are
// Takes in two BufferedImages and returns a double that represents the % difference
public class PercentCalculator {

    public static double compare(BufferedImage img1, BufferedImage img2) {
        int w1 = img1.getHeight();
        int h1 = img1.getHeight();
        int w2 = img2.getHeight();
        int h2 = img2.getHeight();

//        if ((w1 != w2) || (h1 != h2)) {
//            System.out.println("dimensions should be the same between frames");
//            return -1; // throw error here?
//        }

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
        double normalized = totalDiff / (w1 * w2 * 3);
        double percent = (normalized/255) * 100;


        return percent;
    }
}

