package test;

import main.PercentCalculator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class TestCompare {




    public static void main(String[] args) {
        BufferedImage i1;
        BufferedImage i2;
        try{
            // this wont work unless you add testFolder directory
            i1 = ImageIO.read(new File("././TestFolder/cum1.png"));
            i2 = ImageIO.read(new File("././TestFolder/cum2.png"));
        }catch (Exception e){
            System.out.println("There was an error with reading the image files");
            return;
        }


        System.out.println(PercentCalculator.compare(i1, i2));

    }


}
