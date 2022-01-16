
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Test1Compare {

    public static void main(String[] args) {
        ArrayList<BufferedImage> imageArray = new ArrayList<BufferedImage>();
        ArrayList<String> array = new ArrayList();
        try{
            // this wont work unless you add testFolder directory
            imageArray.add(ImageIO.read(new File("././TestFolder/0001.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0001.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0001.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0001.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0001.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0002.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0002.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0002.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0002.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0002.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0003.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0004.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0005.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0006.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0007.jpg")));
            imageArray.add(ImageIO.read(new File("././TestFolder/0008.jpg")));

        } catch (IOException e) {
            e.printStackTrace();
        }

        array = FrameCompare.timeStamp(imageArray, 1.0);
        for(int i=0;i< array.size();i++ ) {
            System.out.println(array.get(i)+1);
        }

        return;
    }


}
