import org.bytedeco.javacv.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

// read the video files inside the /InputFolder directory
// input into an array of videos
public class VideoConverter {

    //public static ArrayList<BufferedImage> imageArray = new ArrayList();
    public static int counter = 0;

    public boolean inputVideo(String pathname, ArrayList<BufferedImage> imageArray) {
        System.out.println("Converting video into frames...");
        try {
            FFmpegFrameGrabber inputVid = new FFmpegFrameGrabber(pathname);
            inputVid.start();

            //convert frames to images in array
            //number added to i sets how many frames to skip

            for (int i = 0; i <= inputVid.getLengthInVideoFrames(); i += 2) {
                inputVid.setVideoFrameNumber(i); //keep this line, idk why but it avoids null conflicts
                Java2DFrameConverter converter2 = new Java2DFrameConverter();
                BufferedImage f = converter2.convert(inputVid.grabKeyFrame());
                if (f != null) {
                    counter++;
                    ImageIO.write(f, "png", new File("C://Users//Leo//Downloads//test//img-" + i + ".png"));
                    imageArray.add(f);
                }
            }
            inputVid.stop();
            System.out.println("Done.");
            return true;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("There was an error converting video into frames.");
            return false;
        }
    }

}
