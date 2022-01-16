package main;


import java.awt.image.BufferedImage;
import java.util.ArrayList;

// take in an array of BufferedImages and returns int[] of indexes (timestamps)
public class FrameCompare {



    public static ArrayList<Integer> TimeStamp(ArrayList<BufferedImage> imgArray) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        double pcc;
        int size = imgArray.size();
        for (int i = 0; i < size; i++) {
            if(i != size-1) {
                pcc = PercentCalculator.compare(imgArray.get(i), imgArray.get(i + 1));
                if (pcc >= 5.00) {
                    arr.add(i);

                }
            }

        }


        return arr;
    }
}