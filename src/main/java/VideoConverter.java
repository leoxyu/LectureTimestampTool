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
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

//    public static void main(String[] args) throws IOException {
//
//        Scanner pathScan = new Scanner(System.in);
//
//
//        //System.out.println("Please Enter The Full Video Path:");
//        //String vidPath = pathScan.nextLine();
//        //C://Users//ayyan//IdeaProjects//LectureTimestampTool//InputVideos//Intro.mp4
//
//
//        FFmpegFrameGrabber inputVid = new FFmpegFrameGrabber("C://Users//ayyan//IdeaProjects//LectureTimestampTool//InputVideos//output.mp4");
//
//        inputVid.start();
//
//        Java2DFrameConverter converter2 = new Java2DFrameConverter();
//
//        double currentProgress = 0;
//
//        int counter = 0;
//
//        //convert frames to images in array
//        //number added to i sets how many frames to skip
//        for (int i = 0; i < inputVid.getLengthInVideoFrames(); i += 5) {
//
//
//            currentProgress = (double) i / inputVid.getLengthInVideoFrames() * 100;
//
//
//            System.out.println("Percent Complete: " + String.format("%.2f", currentProgress) + "%");
//
//            inputVid.setVideoFrameNumber(i); //keep this line, idk why but it avoids null conflicts
//            BufferedImage f = converter2.convert(inputVid.grabKeyFrame());
//
//            //ImageIO.write(f, "png", new File("C://Users//ayyan//IdeaProjects//LectureTimestampTool//OutputImages//img-" + counter + ".png"));
//            imageArray.add(f);
//            counter++;
//        }
//
//        inputVid.stop();
//
//
//    }


}
