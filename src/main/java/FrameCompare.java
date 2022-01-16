import java.awt.image.BufferedImage;
import java.util.ArrayList;

// take in an array of BufferedImages and returns int[] of indexes (timestamps)
public class FrameCompare {

    public static ArrayList<String> timeStamp(ArrayList<BufferedImage> imgArray, double spf) {
        ArrayList<String> arr = new ArrayList();


        //System.out.println("1");
        double pcc;
        int size = imgArray.size();
        //System.out.println(size);
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
//                System.out.println(i);
//                System.out.println(imgArray.get(i));
//                System.out.println(imgArray.get(i + 1));

                pcc = PercentCalculator.compare(imgArray.get(i), imgArray.get(i + 1));
                //System.out.println(pcc + " frame: " + i);
                if (pcc >= 2.00) {
                    double timeSeconds = i * spf;
                    int p1 = (int) (timeSeconds % 60);
                    int p2 = (int) (timeSeconds / 60);
                    int p3 = p2 % 60;
                    p2 = p2 / 60;
                    arr.add(String.format("%02d", p2) + ":" + String.format("%02d", p3) + ":" + String.format("%02d", p1));
                }
            }

        }
        //System.out.println(arr.size());

        return arr;
    }
}